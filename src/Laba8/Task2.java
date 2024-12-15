package Laba8;

interface Printable {
  void Print();
}

public class Task2 {
  public static void main(String[] args) {
    Printable printable = () -> System.out.println("Це повiдомлення з лямбда-виразу!");

    printable.Print();
  }
}