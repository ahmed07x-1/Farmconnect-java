package com.farmconnect;

public class Order {
	
	    int orderId;
	    String productName;
	    int quantity;

	    public Order(int orderId, String productName, int quantity) {
	        this.orderId = orderId;
	        this.productName = productName;
	        this.quantity = quantity;
	    }

	    public void displayOrder() {
	        System.out.println("Order ID: " + orderId);
	        System.out.println("Product: " + productName);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("-------------------");
	    }
	}


