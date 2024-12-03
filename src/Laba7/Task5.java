package Laba7;

class ArithmeticProgressionWithBlock implements Runnable {
  private static int result = 1;

  @Override
  public void run() {
      synchronized (ArithmeticProgressionWithBlock.class) {
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
  }
}

public class Task5 {
  public static void main(String[] args) {
      Thread thread1 = new Thread(new ArithmeticProgressionWithBlock());
      Thread thread2 = new Thread(new ArithmeticProgressionWithBlock());
      Thread thread3 = new Thread(new ArithmeticProgressionWithBlock());

      thread1.start();
      thread2.start();
      thread3.start();
  }
}
