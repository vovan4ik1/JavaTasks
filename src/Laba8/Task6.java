package Laba8;

import java.util.Arrays;

public class Task6 {
  public static void main(String[] args) {
        Integer[] numbers = {12, 45, 78, 34, 89, 123};

        String result = Arrays.stream(numbers)
                              .max(Integer::compareTo)
                              .map(String::valueOf)
                              .orElse("Числа вiдсутнi");

        System.out.println("Максимальне значення: " + result);

        Integer[] emptyArray = {};
        String emptyResult = Arrays.stream(emptyArray)
                                   .max(Integer::compareTo)
                                   .map(String::valueOf)
                                   .orElse("Числа вiдсутнi");

        System.out.println("Результат для порожнього масиву: " + emptyResult);
    }
}
