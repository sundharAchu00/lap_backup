import axios from "axios";

export const get_products = async () => {
  try {
    const response = await axios.get("http://127.0.0.1:8000/product");
    return response.data; // Return the actual data from the response
  } catch (error) {
    console.error("Error fetching products:", error); // Log the error for debugging
    throw new Error("Failed to fetch products"); // Throw a new error to handle it in the caller
  }
};
