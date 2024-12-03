package Laba1;

import java.util.Scanner;

public class Task4 {
    private int num1;
    private int num2;

    public Task4() {}

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first positive integer: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second positive integer: ");
        num2 = scanner.nextInt();
        scanner.close();
    }

    public int calculateGCD() {
        if (num1 == 0) {
            return num2;
        } else if (num2 == 0) {
            return num1;
        } else {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }
    }

    public static void main(String[] args) {
        Task4 gcd = new Task4();
        gcd.readInput();
        int result = gcd.calculateGCD();
        System.out.println("The greatest common divisor is: " + result);
    }
}
