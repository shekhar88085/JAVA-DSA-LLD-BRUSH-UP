package JAVA.Comparable.SortWithMultipleCriteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Smartphone", 800));
        products.add(new Product("Tablet", 800));
        products.add(new Product("Headphones", 150));

        System.out.println("Before Sorting: " + products);

        Collections.sort(products);

        System.out.println("After Sorting: " + products);
    }
}
