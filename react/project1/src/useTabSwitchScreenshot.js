import React, { createContext, useContext, useState } from 'react';
import useTabSwitchDetection from './useTabSwitchDetection';

const ScreenSharingContext = createContext();

export const ScreenSharingProvider = ({ children }) => {
    const [screenTrack, setScreenTrack] = useState(null);
    const [storedImages, setStoredImages] = useState([]);

    const startScreenSharing = async () => {
        try {
            const displayStream = await navigator.mediaDevices.getDisplayMedia({
                video: {
                    mediaSource: 'screen',
                },
            });
            const track = displayStream.getVideoTracks()[0];

            if (!track.getSettings().displaySurface.includes('monitor')) {
                alert('Please share your entire screen for the quiz.');
                track.stop();
                return false;
            }

            track.onended = () => {
                alert('Screen sharing is required to continue the quiz. The quiz will now end.');
                // Handle forced quiz end (e.g., navigate to a different page or stop the quiz)
            };

            setScreenTrack(track);
            return true;
        } catch (err) {
            console.error("Screen sharing permission denied:", err);
            alert('Screen sharing permission is required to continue the quiz.');
            return false;
        }
    };

    const stopScreenSharing = () => {
        if (screenTrack) {
            screenTrack.stop();
            setScreenTrack(null);
        }
    };

    const captureScreenshot = async () => {
        if (screenTrack) {
            try {
                const imageCapture = new ImageCapture(screenTrack);
                const bitmap = await imageCapture.grabFrame();

                const canvas = document.createElement("canvas");
                canvas.width = bitmap.width;
                canvas.height = bitmap.height;
                const context = canvas.getContext("2d");
                context.drawImage(bitmap, 0, 0, bitmap.width, bitmap.height);

                canvas.toBlob((blob) => {
                    setStoredImages(prev => [...prev, blob]);
                }, 'image/png');

            } catch (err) {
                console.error("Error capturing screenshot:", err);
            }
        }
    };

    // Use the tab switch detection hook to capture screenshots on tab switch
    useTabSwitchDetection(captureScreenshot);

    return (
        <ScreenSharingContext.Provider
            value={{
                startScreenSharing,
                stopScreenSharing,
                captureScreenshot,
                storedImages,
            }}
        >
            {children}
        </ScreenSharingContext.Provider>
    );
};

export const useScreenSharing = () => useContext(ScreenSharingContext);
