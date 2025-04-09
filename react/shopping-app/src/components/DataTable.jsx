import React, { useEffect, useState } from "react";
import { DataGrid } from "@mui/x-data-grid";
import Paper from "@mui/material/Paper";

const DataTable = ({ data }) => {
  const [rows, setRows] = useState([]);
  const [columns, setColumns] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      const resolvedData = await data;
      console.log(resolvedData);
      if (resolvedData.length > 0) {
        const dynamicColumns = Object.keys(resolvedData[0]).map((key) => ({
          field: key,
          headerName: key.replace(/_/g, " ").toUpperCase(), // Make header human-readable
          width: 200, // Adjust the width as needed
        }));
        const rowsWithId = resolvedData.map((row) => ({
          ...row,
          id: row.product_id, // Assuming `product_id` is unique
        }));

        setRows(rowsWithId);
        // setRows(resolvedData);
        setColumns(dynamicColumns);
      }
    };
    fetchData();
  }, [data]);

  console.log(rows, columns);

  const paginationModel = { page: 0, pageSize: 5 };

  return (
    <Paper sx={{ height: 400, width: "80%" }}>
      <DataGrid
        rows={rows}
        columns={columns}
        initialState={{ pagination: { paginationModel } }}
        pageSizeOptions={[5, 10]}
        // checkboxSelection
        sx={{ border: 0 }}
      />
    </Paper>
  );
};

export default DataTable;
