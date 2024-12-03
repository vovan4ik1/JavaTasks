package Laba1;

import java.util.Scanner;

public class Task5 {
  private int number;

    public Task5() {}

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();
        scanner.close();
    }

    public int calculateSumOfDigits() {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task5 sumOfDigits = new Task5();
        sumOfDigits.readInput();
        int result = sumOfDigits.calculateSumOfDigits();
        System.out.println("The sum of digits is: " + result);
    }
}
