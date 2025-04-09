import { useEffect } from 'react';

const useTabSwitchDetection = (onTabSwitch) => {
    useEffect(() => {
        const handleVisibilityChange = () => {
            if (document.visibilityState === 'hidden') {
                onTabSwitch();
                alert("suspecious activity detected")
            }
        };

        document.addEventListener('visibilitychange', handleVisibilityChange);
        return () => {
            document.removeEventListener('visibilitychange', handleVisibilityChange);
        };
    }, [onTabSwitch]);
};

export default useTabSwitchDetection;
