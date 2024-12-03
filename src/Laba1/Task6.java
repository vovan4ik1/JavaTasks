package Laba1;

import java.util.Scanner;

public class Task6 {
  public int[] generateFibonacci(int n) {
        int[] fibonacciArray = new int[n];
        if (n > 0) fibonacciArray[0] = 1;
        if (n > 1) fibonacciArray[1] = 1;

        
        for (int i = 2; i < n; i++) {
            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
        }

        return fibonacciArray;
    }

    public int[] reverseArray(int[] array) {
        int n = array.length;
        int[] reversedArray = new int[n];

        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[n - 1 - i];
        }

        return reversedArray;
    }

    public void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть кількість елементів у послідовності Фібоначчі: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Кількість елементів має бути додатною!");
                return;
            }

            int[] fibonacciArray = generateFibonacci(n);

            int[] reversedFibonacciArray = reverseArray(fibonacciArray);

            System.out.println("Послідовність Фібоначчі:");
            printArray(fibonacciArray);

            System.out.println("Зворотна послідовність Фібоначчі:");
            printArray(reversedFibonacciArray);
        } catch (Exception e) {
            System.out.println("Помилка вводу! Введіть коректне ціле число.");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Task6 fibonacciArray = new Task6();
        fibonacciArray.run();
    }
}
