package Laba7;

class SharedData {
  private String message = "";

  public synchronized void write(String msg) throws InterruptedException {
      message = msg;
      notify();
      wait();
  }

  public synchronized void read() throws InterruptedException {
      System.out.println("Printer: " + message);
      notify();
      wait();
  }
}

public class Task6 {
  public static void main(String[] args) {
      SharedData data = new SharedData();

      Thread reader = new Thread(() -> {
          java.util.Scanner scanner = new java.util.Scanner(System.in);
          try {
              while (true) {
                  System.out.print("Reader: Введіть повідомлення: ");
                  String input = scanner.nextLine();
                  if (input.equalsIgnoreCase("exit")) break;
                  data.write(input);
              }
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }
      });

      Thread printer = new Thread(() -> {
          try {
              while (!Thread.currentThread().isInterrupted()) {
                  data.read();
              }
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }
      });

      reader.start();
      printer.start();
  }
}
