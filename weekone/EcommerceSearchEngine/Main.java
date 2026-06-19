package week1.weekone.EcommerceSearchEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class Main {

    public static Product binarySearch(ArrayList<Product> products, String key) {

        int left = 0;
        int right = products.size() - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int cmp = products.get(mid).name.compareToIgnoreCase(key);

            if (cmp == 0)
                return products.get(mid);
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Mobile", 25000));
        products.add(new Product(103, "Headphones", 2000));
        products.add(new Product(104, "Keyboard", 1500));
        products.add(new Product(105, "Mouse", 800));

        // Sort by product name
        Collections.sort(products, Comparator.comparing(p -> p.name));

        Product result = binarySearch(products, "Laptop");

        if (result != null) {
            System.out.println("Product Found");
            System.out.println("ID    : " + result.id);
            System.out.println("Name  : " + result.name);
            System.out.println("Price : ₹" + result.price);
        } else {
            System.out.println("Product Not Found");
        }
    }
}