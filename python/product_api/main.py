from fastapi import FastAPI, HTTPException
from starlette.middleware.cors import CORSMiddleware
from db_config import get_database_connection

app = FastAPI()


origins = [
    "http://localhost:3000",  # React development server
]

# Add CORSMiddleware to the app
app.add_middleware(
    CORSMiddleware,
    allow_origins=origins,  # List of allowed origins (React app or other frontends)
    allow_credentials=True,
    allow_methods=["*"],  # Allows all HTTP methods (GET, POST, etc.)
    allow_headers=["*"],  # Allows all headers
)


@app.get('/')
def root():
    return {"Greeting": "Welcome to python"}


@app.get('/product/{p_id}')
def get_by_id(p_id: int) -> dict:
    connection = get_database_connection()
    if connection.is_connected():
        cursor = connection.cursor()
        query = "SELECT * FROM productdetail WHERE product_id = %s;"
        cursor.execute(query, (p_id,))  # Make sure p_id is passed as a tuple
        product = cursor.fetchone()
        connection.close()
        # return {"product": {col for col in product}}
        # Extract column names from the cursor's description
        columns = (desc[0] for desc in cursor.description)
        # Combine column names with their corresponding values from the product
        product_dict = dict(zip(columns, product))

        return product_dict
    else:
        raise HTTPException(status_code=404, detail="Item not found")


@app.get('/product')
def fetch_all() -> list:
    connection = get_database_connection()
    cursor = connection.cursor()
    query = "SELECT * FROM productdetail;"
    cursor.execute(query)
    products = cursor.fetchall()
    columns = [desc[0] for desc in cursor.description]

    print(products)
    # Convert each product (tuple) to a dictionary
    product_list = [dict(zip(columns, product)) for product in products if product]
    cursor.close()
    connection.close()
    return product_list
