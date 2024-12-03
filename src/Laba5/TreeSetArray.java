package Laba5;

import java.util.TreeSet;

public class TreeSetArray {
  public static void main(String[] args) {
    TreeSet <Product> products = new TreeSet<>();

    products.add(new Product("Laptop", 50, 150));
    products.add(new Product("Smartphone", 60, 70));
    products.add(new Product("Tablet", 100.50, 50));
    products.add(new Product("PC", 230, 70));
        System.out.println("First element: " + products.first());
        System.out.println("Last element: " + products.last());
        System.out.println("HeadSet (<800): " + products.headSet(new Product("", 800, 45)));
        System.out.println("TailSet (>=800): " + products.tailSet(new Product("", 800, 89)));
        System.out.println("SubSet (50, 1500): " + products.subSet(new Product("", 50 , 56), new Product("", 1500, 56)));
        System.out.println("Ceiling (>=800): " + products.ceiling(new Product("", 800,56)));
        System.out.println("Floor (<=800): " + products.floor(new Product("", 800, 50)));
        System.out.println("Higher (>800): " + products.higher(new Product("", 800, 58)));
        System.out.println("Lower (<800): " + products.lower(new Product("", 800, 89)));
        System.out.println("Poll First: " + products.pollFirst());
        System.out.println("Poll Last: " + products.pollLast());
        System.out.println("Descending Set: " + products.descendingSet());
  }
}
