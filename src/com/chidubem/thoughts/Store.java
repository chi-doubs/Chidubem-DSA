package com.chidubem.thoughts;

public class Store {
    String productType;
    int inventoryCount;
    double inventoryPrice;

    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }


    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade", 23, 23.13);
        Store cookieShop = new Store("cookies", 12, 3.75);
        Store inventoryStore = new Store("Ketchup", 150, 345.86);

        lemonadeStand.greetCustomer("Chidubem");
        System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " we have " + lemonadeStand.inventoryCount + " in Stock" );
        System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
    }
}
