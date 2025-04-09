import React from "react";
import { Route, BrowserRouter as Router, Routes } from "react-router-dom";
import { ScreenSharingProvider } from "./useTabSwitchScreenshot";
// Import all the components for your routes
import FinishQuizButton from "./FinishQuizButton";
import QuizComponent from "./QuizComponent";
import StartQuizButton from "./StartQuizButton";
import DisplayCapturedImages from "./DisplayCapturedImages";
import UseQueryComponent from "./UseQueryComponent";
// Import other components as needed

const App = () => {
  return (
    // <ScreenSharingProvider>
      <Router>
        <Routes>
          <Route path="/" element={<UseQueryComponent />} />
          {/* <Route path="/" element={<StartQuizButton />} />
                    <Route path="/quiz" element={<QuizComponent />} />
                    <Route path="/finish-quiz" element={<FinishQuizButton />} />
                    <Route path="/captured-images" element={<DisplayCapturedImages/>} /> */}
          {/* Add other routes as needed */}
        </Routes>
      </Router>
    // </ScreenSharingProvider>
  );
};

export default App;
