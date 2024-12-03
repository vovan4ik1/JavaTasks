package Laba1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        int Number1 = scanner.nextInt();
        
        System.out.print("Enter second number:");
        int Number2 = scanner.nextInt();
        
        int sum = Number1 + Number2;
        
        System.out.println("Total: " + sum);
        
        scanner.close();
    }
}
