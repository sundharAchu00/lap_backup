import React from 'react';
import useTabSwitchScreenshot from './useTabSwitchScreenshot';
import JSZip from 'jszip';

const QuizEngine = () => {
    const { startScreenSharing, stopScreenSharing, storedImages } = useTabSwitchScreenshot();

    const handleStartQuiz = async () => {
        const permissionGranted = await startScreenSharing();
        if (!permissionGranted) {
            // Handle case where permission is not granted
            return;
        }

        // Proceed with the quiz logic here
    };

    const handleQuizEnd = async () => {
        stopScreenSharing();

        const zip = new JSZip();
        
        storedImages.forEach((blob, index) => {
            console.log(index)
            zip.file(`screenshot-${index + 1}.png`, blob);
        });

        const zipBlob = await zip.generateAsync({ type: 'blob' });
        
        const formData = new FormData();
        formData.append('file', zipBlob, 'screenshots.zip');

        await fetch('/api/upload-screenshots', {
            method: 'POST',
            body: formData
        });
    };

    return (
        <div>
            <button onClick={handleStartQuiz}>Start Quiz</button>
            {/* Quiz content here */}
            <button onClick={handleQuizEnd}>Finish Quiz</button>
        </div>
    );
};

export default QuizEngine;
