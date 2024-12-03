package Laba7;

class MyRunnable implements Runnable {
  @Override
  public void run() {
      for (int i = 0; i <= 10000; i += 10) {
          if (Thread.currentThread().isInterrupted()) {
              System.out.println("Розрахунок завершено!!!");
              return;
          }
          System.out.println(Thread.currentThread().getName() + ": " + i);
      }
  }
}

public class Task3 {
  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new Thread(new MyRunnable());
    Thread thread2 = new Thread(new MyRunnable());
    Thread thread3 = new Thread(new MyRunnable());

    thread1.start();
    thread2.start();
    thread3.start();

    Thread.sleep(2000);
    thread1.interrupt();
    thread2.interrupt();
    thread3.interrupt();
}
}
