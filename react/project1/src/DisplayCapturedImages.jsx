import React from 'react';
import { useScreenSharing } from './useTabSwitchScreenshot';
import { useNavigate } from 'react-router-dom';

const DisplayCapturedImages = () => {
    const { storedImages } = useScreenSharing();
    const navigate = useNavigate();

    return (
        <div>
            <h3>Captured Screenshots</h3>
            <div style={{ display: 'flex', flexWrap: 'wrap' }}>
                {storedImages.map((blob, index) => {
                    const imageUrl = URL.createObjectURL(blob);
                    return (
                        <div key={index} style={{ margin: '10px' }}>
                            <img src={imageUrl} alt={`Screenshot ${index + 1}`} width="200px" />
                        </div>
                    );
                })}
            </div>
            <button onClick={()=>navigate("/")}>Ok</button>
        </div>
    );
};

export default DisplayCapturedImages;
