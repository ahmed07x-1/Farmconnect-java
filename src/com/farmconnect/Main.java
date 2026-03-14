package com.farmconnect;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FarmConnectSystem system = new FarmConnectSystem();

        while(true) {

        	System.out.println("1 Add Product");
        	System.out.println("2 Update Product");
        	System.out.println("3 Delete Product");
        	System.out.println("4 View Products");
        	System.out.println("5 View Orders");

            int role = sc.nextInt();

            switch(role) {

            
            case 1:

            	while(true) {

            	System.out.println("----- Farmer Menu -----");
            	System.out.println("1 Add Product");
            	System.out.println("2 Update Product");
            	System.out.println("3 Delete Product");
            	System.out.println("4 View Products");
            	System.out.println("5 View Orders");
            	System.out.println("6 Back");

            	int f = sc.nextInt();

            	if(f == 1) {

            	    System.out.println("Enter ID:");
            	    int id = sc.nextInt();

            	    System.out.println("Enter Name:");
            	    String name = sc.next();

            	    System.out.println("Enter Price:");
            	    double price = sc.nextDouble();

            	    System.out.println("Enter Quantity:");
            	    int qty = sc.nextInt();

            	    Product p = new Product(id,name,price,qty);
            	    system.addProduct(p);
            	}

            	else if(f == 2) {

            	    System.out.println("Enter Product ID:");
            	    int id = sc.nextInt();

            	    System.out.println("Enter New Price:");
            	    double price = sc.nextDouble();

            	    System.out.println("Enter New Quantity:");
            	    int qty = sc.nextInt();

            	    system.updateProduct(id,price,qty);
            	}

            	else if(f == 3) {

            	    System.out.println("Enter Product ID:");
            	    int id = sc.nextInt();

            	    system.deleteProduct(id);
            	}

            	else if(f == 4) {

            	    system.viewProducts();
            	}

            	else if(f == 5) {

            	    system.viewOrders();
            	}

            	else if(f == 6) {

            	    break;
            	}

            	}

            	break;

                

            case 2:

                System.out.println("1 View Products");
                System.out.println("2 Place Order");

                int b = sc.nextInt();

                if(b == 1) {

                    system.viewProducts();
                }

                else if(b == 2) {

                    System.out.println("Enter Order ID:");
                    int id = sc.nextInt();

                    System.out.println("Enter Product Name:");
                    String name = sc.next();

                    System.out.println("Enter Quantity:");
                    int qty = sc.nextInt();

                    Order o = new Order(id,name,qty);

                    system.placeOrder(o);
                }

                break;

            case 3:

                System.out.println("Thank you!");
                System.exit(0);
            }
        }
    }
}
