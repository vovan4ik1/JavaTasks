package Laba8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Product {
  private String name;
  private String brand;
  private double price;
  private int quantity;

  public Product(String name, String brand, double price, int quantity) {
    this.name = name;
    this.brand = brand;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
  }

  public String getBrand() {
    return brand;
  }

  public Double getPrice() {
    return price;
  }

  public int getQuntity() {
    return quantity;
  }

  public String toString() {
    return "Продукт {" +
        "Назва ='" + name + '\'' +
        "Бренд ='" + brand + '\'' +
        ",Цiна ='" + price + '\'' +
        ",Кiлькiсть =" + quantity +
        "}";
  }
}

public class Task4 {
  public static void main(String[] args) {
    List<Product> products = Arrays.asList(
        new Product("Ноутбук", "BrandA", 1500, 10),
        new Product("Сматрофон", "BrandB", 800, 20),
        new Product("Навушники", "BrandC", 150, 50),
        new Product("Moнiтор", "BrandA", 300, 15),
        new Product("Клавiатура", "BrandB", 80, 25));

    System.out.println("Brands:");
    products.stream()
        .map(Product::getBrand)
        .distinct()
        .forEach(System.out::println);

    System.out.println("\nПродуктiв з цiною бiльше нiж 1000:");
    products.stream()
        .filter(p -> p.getPrice() < 1000)
        .limit(2)
        .forEach(System.out::println);


    int totalCount = products.stream()
        .map(Product::getQuntity)
        .reduce(0, Integer::sum);
    System.out.println("\nЗагальна кiлькiсть всiх продуктiв: " + totalCount);


    System.out.println("\nGrouped by brand:");
    Map<String, List<Product>> groupedBrand = products.stream()
        .collect(groupingBy(Product::getBrand));
    groupedBrand.forEach((brand, productList) -> {
      System.out.println(brand + ": " + productList);
    });

    System.out.println("\nCортування за цiною:");
    List<Product> sortedByPrice = products.stream()
        .sorted(Comparator.comparingDouble(Product::getPrice))
        .collect(toList());
    sortedByPrice.forEach(System.out::println);
  }
}
