package Laba2.Task2;

public class Operation {

  public static int addition(int... numbers) {
      int sum = 0;
      for (int number : numbers) {
          sum += number;
      }
      return sum;
  }

  public static int subtraction(int... numbers) {
      if (numbers.length == 0) return 0;
      int subtra = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          subtra -= numbers[i];
      }
      return subtra;
  }

  public static int multiplication(int... numbers) {
      int multiplication = 1;
      for (int number : numbers) {
          multiplication *= number;
      }
      return multiplication;
  }

  public static double division(int... numbers) {
      if (numbers.length == 0) return 0;
      double division = numbers[0];
      for (int i = 1; i < numbers.length; i++) {
          if (numbers[i] == 0) {
              throw new IllegalArgumentException("Cannot divide by zero");
          }
          division /= numbers[i];
      }
      return division;
  }


  public static double average(int... numbers) {
      if (numbers.length == 0) return 0;
      int average = addition(numbers);
      return (double) average / numbers.length;
  }

  public static int maximum(int... numbers) {
      if (numbers.length == 0) return Integer.MIN_VALUE;
      int max = numbers[0];
      for (int number : numbers) {
          if (number > max) {
              max = number;
          }
      }
      return max;
  }

  public static int minimum(int... numbers) {
      if (numbers.length == 0) return Integer.MAX_VALUE;
      int min = numbers[0];
      for (int number : numbers) {
          if (number < min) {
              min = number;
          }
      }
      return min;
  }
}

