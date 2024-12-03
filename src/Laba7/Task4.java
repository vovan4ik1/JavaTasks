package Laba7;

class ArithmeticProgression implements Runnable {
  private static int result = 1;

  private synchronized void printProgression() {
      for (int i = 0; i < 100; i++) {
          System.out.print(result + " ");
          result++;
          try {
              Thread.sleep(200);
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
          }
      }
      System.out.println();
  }

  @Override
  public void run() {
      printProgression();
  }
}

public class Task4 {
  public static void main(String[] args) {
      Thread thread1 = new Thread(new ArithmeticProgression());
      Thread thread2 = new Thread(new ArithmeticProgression());
      Thread thread3 = new Thread(new ArithmeticProgression());

      thread1.start();
      thread2.start();
      thread3.start();
  }
}
