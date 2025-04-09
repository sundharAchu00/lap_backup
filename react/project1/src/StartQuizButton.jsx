import React from 'react';
import { useScreenSharing } from './useTabSwitchScreenshot';
import { useNavigate } from 'react-router-dom';

const StartQuizButton = () => {
    const { startScreenSharing } = useScreenSharing();
    const navigate = useNavigate();

    const handleStartQuiz = async () => {
        const permissionGranted = await startScreenSharing();
        console.log("permission : ",permissionGranted)
        if (!permissionGranted) {
            // Handle case where permission is not granted
            return;
        }else{
            navigate("/quiz")
        }

        // Navigate to the quiz or proceed with quiz logic
    };

    return <button onClick={handleStartQuiz}>Start Quiz</button>;
};

export default StartQuizButton;
