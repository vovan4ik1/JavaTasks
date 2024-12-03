package Laba5;

import java.util.HashMap;

public class Map {
  public static void main (String args[]){
    HashMap<String, Product> map = new HashMap<>();
    map.put("Laptop", new Product("Laptop", 50, 150));
    map.put("Smartphone", new Product("Smartphone", 60, 70));
    map.put("Tablet", new Product("Tablet", 100.50, 50));
    map.put("PC", new Product("PC", 230, 70));

    System.out.println("Laptop: " + map.get("Laptop"));

    System.out.println("Contains key 'Jeans': " + map.containsKey("Jeans"));
    System.out.println("Contains value Product('Shoes', 70.00): " + map.containsValue(new Product("Shoes", 70.00, 67)));

    System.out.println("Keys: " + map.keySet());
    System.out.println("Values: " + map.values());

    for (HashMap.Entry<String, Product> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    map.remove("Jeans");
    map.putIfAbsent("Tablet", new Product("Tablet", 300.99 , 50));
    System.out.println("Map size: " + map.size());

    map.clear();
    System.out.println("Map is empty: " + map.isEmpty());
  }
}
