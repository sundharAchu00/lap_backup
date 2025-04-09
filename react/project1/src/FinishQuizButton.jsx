import React from "react";
import { useNavigate } from "react-router-dom";
import { useScreenSharing } from "./useTabSwitchScreenshot";
import JSZip from "jszip";

const FinishQuizButton = () => {
  const { stopScreenSharing, storedImages } = useScreenSharing();
  const navigate = useNavigate();

  const handleQuizEnd = async () => {
    stopScreenSharing();

    // Create a new ZIP file
    const zip = new JSZip();
    storedImages.forEach((blob, index) => {
      console.log(index);
      zip.file(`screenshot-${index + 1}.png`, blob);
    });

    // Generate the ZIP file
    const zipBlob = await zip.generateAsync({ type: "blob" });

    // Create a download link and trigger the download
    // const link = document.createElement("a");
    // link.href = URL.createObjectURL(zipBlob);
    // link.download = "screenshots.zip";
    // document.body.appendChild(link);
    // link.click();
    // document.body.removeChild(link);

    // Prepare the ZIP file for upload
    const formData = new FormData();
    formData.append("file", zipBlob, "screenshots.zip");

    // Upload the ZIP file to the backend
    await fetch("/api/upload-screenshots", {
      method: "POST",
      body: formData,
    });

    // Optionally navigate to a results page or display a message
    navigate("/captured-images");
  };

  return <button onClick={()=>{handleQuizEnd();
    navigate("/")
    }}>Finish Quiz</button>;
};

export default FinishQuizButton;
