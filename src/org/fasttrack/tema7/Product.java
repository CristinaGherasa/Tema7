package org.fasttrack.tema7;

public class Product {
    private String name2;
    private double price;
    private int quantity;
    private String category;

    public Product(String name2, double price, int quantity, String category) {
        this.name2 = name2;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name2;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getCategory(){
        return category;
    }
    public boolean hasStock(){
        return quantity != 0;
    }
    public boolean isCategory(String category){
        return this.category.equals(category);
    }

    public String toString() {
        return "Name: " + name2 + ", Price: " + price + ", Quantity: " + quantity + ", Category: " + category;
    }
}
