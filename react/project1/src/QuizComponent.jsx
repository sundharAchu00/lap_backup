import React, { useEffect } from 'react';
import { useScreenSharing } from './useTabSwitchScreenshot';
import { useNavigate } from 'react-router-dom';

const QuizComponent = () => {
    const { captureScreenshot } = useScreenSharing();
    const navigate = useNavigate();
    useEffect(() => {
        const handleTabSwitch = () => {
            if (document.hidden) {
                captureScreenshot();
            }
        };

        document.addEventListener('visibilitychange', handleTabSwitch);

        return () => {
            document.removeEventListener('visibilitychange', handleTabSwitch);
        };
    }, [captureScreenshot]);

    return <div>
        <div>
            <p>this your quiz component</p>
            <button onClick={()=>{
                navigate("/finish-quiz")
            }}>preview</button>
        </div>
    </div>;
};

export default QuizComponent;
