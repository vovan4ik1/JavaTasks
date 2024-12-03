package Laba5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProductArray {
  public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 50, 150));
        products.add(new Product("Smartphone", 60, 70));
        products.add(new Product("Tablet", 100.50, 50));
        products.add(new Product("PC", 230, 70));

        List<Product> moreProducts = new ArrayList<>();
        moreProducts.add(new Product("Colunm", 150, 30));
        moreProducts.add(new Product("TV", 450, 120));
        products.addAll(moreProducts);

        System.out.println("Продукт за iндексом 2: " + products.get(2));

        int index = products.indexOf(new Product("Mouse", 150, 70));
        System.out.println("Iндекс 'Mouse': " + index);

        products.remove(1);
        System.out.println("Пiсля видалення продукту за iндексом 1: " + products);

        products.set(0, new Product("Rollet", 240, 2000));
        System.out.println("Пiсля замiни першого продукту: " + products);


        boolean contains = products.contains(new Product("Tablet", 456, 300));
        System.out.println("Мiстить 'Tablet': " + contains);

        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Список пiсля сортування за цiною: " + products);

        List<Product> subList = products.subList(0, 2);
        System.out.println("Пiдсписок: " + subList);
        Object[] productArray = products.toArray();
        System.out.println("Масив продуктiв: " + Arrays.toString(productArray));

        products.clear();
        System.out.println("Список пiсля очищення: " + products);

        System.out.println("Список порожнiй: " + products.isEmpty());
    }
}
