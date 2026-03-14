package com.farmconnect;

public class FarmConnectSystem {

    Product[] products = new Product[50];
    Order[] orders = new Order[50];

    int productCount = 0;
    int orderCount = 0;

    // Add product
    public void addProduct(Product p) {

        products[productCount] = p;
        productCount++;

        System.out.println("Product added successfully");
    }

    // View products
    public void viewProducts() {

        if(productCount == 0) {
            System.out.println("No products available");
            return;
        }

        for(int i = 0; i < productCount; i++) {
            products[i].display();
        }
    }

    // Delete product
    public void deleteProduct(int id) {

        for(int i = 0; i < productCount; i++) {

            if(products[i].id == id) {

                products[i] = products[productCount - 1];
                productCount--;

                System.out.println("Product deleted");
                return;
            }
        }

        System.out.println("Product not found");
    }

    // Update product
    public void updateProduct(int id, double price, int quantity) {

        for(int i = 0; i < productCount; i++) {

            if(products[i].id == id) {

                products[i].price = price;
                products[i].quantity = quantity;

                System.out.println("Product updated successfully");
                return;
            }
        }

        System.out.println("Product not found");
    }

    // Search product
    public void searchProduct(String name) {

        for(int i = 0; i < productCount; i++) {

            if(products[i].name.equalsIgnoreCase(name)) {

                products[i].display();
                return;
            }
        }

        System.out.println("Product not found");
    }

    // Place order
    public void placeOrder(Order o) {

        orders[orderCount] = o;
        orderCount++;

        System.out.println("Order placed successfully");
    }

    // View orders
    public void viewOrders() {

        if(orderCount == 0) {
            System.out.println("No orders yet");
            return;
        }

        for(int i = 0; i < orderCount; i++) {
            orders[i].displayOrder();
        }
    }
}