package org.fasttrack.tema7;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gabriel", 30, true);
        String name = person.getName();
        int age = person.getAge();
        boolean isMarried = person.isMarried();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Married: " + isMarried);



        Person[] persons = new Person[3];
        persons[0] = new Person("John Doe", 30, true);
        persons[1] = new Person("Jane Smith", 25, false);
        persons[2] = new Person("Mark Johnson", 40, true);

        for (Person newPerson : persons) {
            System.out.println(newPerson.toString());
        }


        Product product = new Product("Phone", 599.99, 10, "Electronics");

        String name2 = product.getName();
        double price = product.getPrice();
        int quantity = product.getQuantity();
        String category = product.getCategory();
        boolean hasStock = product.hasStock();
        boolean isElectronics = product.isCategory("Electronics");

        System.out.println("Name: " + name2);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category);
        System.out.println("Has Stock: " + hasStock);
        System.out.println("Is Electronics: " + isElectronics);



        Product product1 = new Product("Phone", 700.99, 20, "Electronics");
        Product product2 = new Product("Book", 29.99, 0, "Books");
        Product product3 = new Product("Shirt", 39.99, 5, "Clothing");

        String name11 = product1.getName();
        double price11 = product1.getPrice();
        int quantity11 = product1.getQuantity();
        String category11 = product1.getCategory();
        boolean hasStock11 = product1.hasStock();
        boolean isElectronics11 = product1.isCategory("Electronics");
        System.out.println("Product 1 details:");
        System.out.println(product1.toString());
        System.out.println("Has Stock: " + hasStock11);
        System.out.println("Is Electronics: " + isElectronics11);
        System.out.println();

        String name12 = product2.getName();
        double price12 = product2.getPrice();
        int quantity12 = product2.getQuantity();
        String category12 = product2.getCategory();
        boolean hasStock12 = product2.hasStock();
        boolean isElectronics12 = product2.isCategory("Electronics");
        System.out.println("Product 2 details:");
        System.out.println(product2.toString());
        System.out.println("Has Stock: " + hasStock12);
        System.out.println("Is Electronics: " + isElectronics12);
        System.out.println();

        String name13 = product3.getName();
        double price13 = product3.getPrice();
        int quantity13 = product3.getQuantity();
        String category13 = product3.getCategory();
        boolean hasStock13 = product3.hasStock();
        boolean isElectronics13 = product3.isCategory("Electronics");
        System.out.println("Product 3 details:");
        System.out.println(product3.toString());
        System.out.println("Has Stock: " + hasStock13);
        System.out.println("Is Electronics: " + isElectronics13);
        System.out.println();



        Bottle bottle = new Bottle(1000);
        System.out.println("Has max availability: " + bottle.hasMaxAvailability());
        System.out.println("Available liquid: " + bottle.getAvailableLiquid());
        System.out.println("Empty capacity: " + bottle.getEmptyCapacity());
        System.out.println(bottle.openBottle());
        System.out.println(bottle.openBottle());
        System.out.println(bottle.drinkLiquid(500));
        System.out.println(bottle.drinkLiquid(600));
        System.out.println(bottle.closeBottle());
        System.out.println(bottle.closeBottle());
        System.out.println("Available liquid: " + bottle.getAvailableLiquid());
    }
}