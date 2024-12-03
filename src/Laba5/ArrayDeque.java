package Laba5;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDeque {
  public static void main (String[] args){
     Deque<Product> Queue = new LinkedList<>();


        Queue.push(new Product("Laptop", 1500, 130));
        Queue.offerLast(new Product("Smartphone", 800, 40));
        Queue.offerLast(new Product("Tablet", 500, 50));
        Queue.push(new Product("Smartwatch", 200.50,50 ));

        System.out.println("Перший продукту:" + Queue.getFirst());
        System.out.println("Останiй продукт:" + Queue.peekLast());

        System.out.println("Видалення першого продукту:" + Queue.pop());
        System.out.println("Видалення оcтанiй продукту: " + Queue.pollLast());
        System.out.println("Видалення оcтанiй продукту: " + Queue.removeLast());
    }
}
