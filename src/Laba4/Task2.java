package Laba4;

public class Task2 {
  public static void main(String[] args) {
    int num1 = 50;
    int num2 = 23;

    StringBuilder addition = new StringBuilder();
    addition.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2);
    System.out.println("Додавання: " + addition);

    StringBuilder subtraction = new StringBuilder();
    subtraction.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2);
    System.out.println("Віднімання: " + subtraction);

    StringBuilder multiplication = new StringBuilder();
    multiplication.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
    System.out.println("Множення: " + multiplication);

    StringBuilder additionModified = new StringBuilder(addition);
    additionModified.deleteCharAt(additionModified.indexOf("="));
    additionModified.insert(additionModified.indexOf(" ") + 3, "рівно");
    System.out.println("Додавання з \"рівно\" " + additionModified);

    StringBuilder subtractionModified = new StringBuilder(subtraction);
    int equalsIndex = subtractionModified.indexOf("=");
    subtractionModified.replace(equalsIndex, equalsIndex + 1, "рівно");
    System.out.println("Віднімання з \"рівно\" " + subtractionModified);

    StringBuilder reversedAddition = new StringBuilder(addition).reverse();
    System.out.println("Додавання у зворотньому порядку: " + reversedAddition);

    System.out.println("Довжина рядка додавання: " + addition.length());
    System.out.println("Ємність рядка додавання: " + addition.capacity());
}
}
