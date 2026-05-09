package org.example.polymorphism.onlineshopping;

class Product {

    protected String productName;
    protected double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void calculateDiscount() {
        System.out.println("No discount available");
    }

    void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}
