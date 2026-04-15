package DAY16;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating;
    }
}

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 75000, 4.5));
        products.add(new Product("Phone", 30000, 4.2));
        products.add(new Product("Tablet", 25000, 4.0));
        products.add(new Product("Headphones", 2000, 4.8));

        Collections.sort(products, (a, b) -> a.name.compareTo(b.name));
        System.out.println("Sorted by Name:");
        print(products);

        Collections.sort(products, (a, b) -> Double.compare(a.price, b.price));
        System.out.println("\nSorted by Price:");
        print(products);

        Collections.sort(products, (a, b) -> Double.compare(b.rating, a.rating));
        System.out.println("\nSorted by Rating:");
        print(products);
    }

    static void print(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}