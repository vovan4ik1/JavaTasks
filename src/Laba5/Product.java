package Laba5;

class Product implements Comparable<Product> {
  private String name;
  private double price;
  private int quantity;

  public Product (String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return name;
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
            ",Цiна ='" + price + '\'' +
            ",Кiлькiсть =" + quantity +
            "}";
  }

  public int compareTo(Product other) {
    return Double.compare(this.price, other.price); // Порівняння за ціною
  }
}
