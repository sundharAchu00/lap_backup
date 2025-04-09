import React from "react";
import logo from "../assets/logo.jpg";

const Navbar = (props) => {
  // console.log(props);
  return (
    <div className="w-100 border p-2 d-flex justify-content-between">
      <div>
        <img src={logo} alt="logo here" height={50} width={50} />
      </div>
      <div className="mt-3">{props.title}</div>
    </div>
  );
};

export default Navbar;
