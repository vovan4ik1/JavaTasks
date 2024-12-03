package Laba4;

import java.util.Formatter;
import java.util.List;
import java.util.ArrayList;

class Tovar {
    private final String brand;
    private final String size;
    private final String category;
    private final double price;

    public Tovar(String brand, String size, String category, double price) {
      this.brand = brand;
      this.size = size;
      this.category = category;
      this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}

public class Task3 {
    public static void main(String[] args) {
        List<Tovar> products = new ArrayList<>();
        products.add(new Tovar("Michelin","195/55 R15", "Зимня", 1500.78));
        products.add(new Tovar("Continental", "195/75 R16C", "Лiтня", 1000.56));
        products.add(new Tovar("BridgeStone", "215/55 R16","Зимня", 500.78));
        products.add(new Tovar("Matador", "215/55 R17","Лiтня", 300.45));
        products.add(new Tovar("Firelli", "215/60 R17","ВсiСезона", 2200.99));
        products.add(new Tovar("Good&Year", "215/50 R17","Зимня", 1200.30));
        products.add(new Tovar("Hankook", "215/60 R17","Зимня", 1800.10));
        products.add(new Tovar("Dunlop", "205/65 R15","ВсiСезона", 999.99));

        String dateTime = "28.03.2019 13:25:12";
        double totalAmount = 0;

        Formatter formatter = new Formatter();
        formatter.format("Дата та час покупки: %s\n", dateTime);
        formatter.format("===========================================\n");
        formatter.format("%-3s %-10s %-15s %-10s %10s\n", "№", "Товар", "Розмiр", "Категорiя", "Цiна");
        formatter.format("===========================================\n");

        for (int i = 0; i < products.size(); i++) {
            Tovar product = products.get(i);
            formatter.format("%-3d %-10s %-15s %-10s %10.2f \n", i + 1, product.getBrand(), product.getSize(), product.getCategory(), product.getPrice());
            totalAmount += product.getPrice();
        }

        formatter.format("===========================================\n");
        formatter.format("Разом: %34.2f \n", totalAmount);

        System.out.println(formatter);
        formatter.close();
    }
}

