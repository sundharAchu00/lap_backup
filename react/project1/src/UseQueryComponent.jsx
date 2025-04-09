import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useQuery } from 'react-query';

const UseQueryComponent = () => {

    const API_URL = `https://fakestoreapi.com/products`;

    const [data,setData] = useState([]);

    

    useEffect(()=>{
        const fetchProducts = async () => {
            const response = await axios.get(API_URL);
            console.log(response);
            setData(response?.data);
        };
        fetchProducts();
    },[API_URL])

    // const { data, isLoading,error,refetch} = useQuery('productData', () => fetchProducts());

    // if (isLoading) {
    //     return <h1>Loading ....</h1>;
    // }

    // if (error) {
    //     return <p className="error">{error.message}</p>;
    // }

  return (
    <div className="container">
        hello
            <ul>
                {data?.map((product) => (
                <li key={product?.id}>{product?.title}</li>
                ))}
            </ul>
            {/* <button onClick={refetch} className="btn btn-primary btn-md">Re fetch</button> */}
        </div>
  )
}

export default UseQueryComponent;