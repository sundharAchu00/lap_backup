import React, { useEffect, useState } from "react";
import Navbar from "../components/Navbar.jsx";
import constants from "../constants/Constants";
import DataTable from "../components/DataTable.jsx";
import { get_products } from "../services/service.js";

const Dashboard = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    setData(get_products());
  }, []);

  return (
    <>
      <Navbar title={constants.title} />
      Dashboard
      <div className="d-flex justify-content-center">
        <DataTable data={data} />
      </div>
    </>
  );
};

export default Dashboard;
