package Laba4;

import java.text.NumberFormat;
import java.util.*;

class Product {
    private final String nameKey;
    private final String categoryKey;
    private final double price;

    public Product(String nameKey, String categoryKey, double price) {
        this.nameKey = nameKey;
        this.categoryKey = categoryKey;
        this.price = price;
    }

    public String getNameKey() {
        return nameKey;
    }

    public String getCategoryKey() {
        return categoryKey;
    }

    public double getPrice() {
        return price;
    }
}

public class Task4 {
    private static ResourceBundle bundle;

    public static void main(String[] args) {
        Locale locale = new Locale("ua", "UA");
        bundle = ResourceBundle.getBundle("data", locale);

        List<Product> products = Arrays.asList(
            new Product("jeans", "category", 1500.78),
            new Product("skirt", "category", 1000.56),
            new Product("tie", "category", 500.78)
        );

        double totalAmount = 0;

        System.out.println(bundle.getString("dateTime") + ": " + new Date());
        System.out.println("===========================================");
        System.out.printf("%-3s %-10s %-15s %-10s\n",
                bundle.getString("number"),
                bundle.getString("product"),
                bundle.getString("category"),
                bundle.getString("price"));
        System.out.println("===========================================");

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            String productName = bundle.getString(product.getNameKey());
            String category = bundle.getString(product.getCategoryKey());

            System.out.printf("%-3d %-10s %-15s %10s\n",
                    i + 1,
                    productName,
                    category,
                    currencyFormat.format(product.getPrice()));
            totalAmount += product.getPrice();
        }

        System.out.println("===========================================");
        System.out.printf("%-30s %10s\n", bundle.getString("total"), currencyFormat.format(totalAmount));
    }
}
