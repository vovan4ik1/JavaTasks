package Laba7;

class TaskThread extends Thread {
  public void run () {
      for(int i = 0 ; i < 100 ; i++){
        System.out.println("Я люблю програмувати)");
      }
  }
}

public class Task2 {
  public static void main(String[] args) throws InterruptedException {
    TaskThread thread = new TaskThread();

    System.out.println("Ім'я потоку: " + thread.getName());
    System.out.println("Прiоритет: " + thread.getPriority());
    System.out.println("Живий: " + thread.isAlive());
    System.out.println("Демон: " + thread.isDaemon());


    thread.start();
    System.out.println("Потiк в станi RUNNING.");


    thread.setName("ProgrammingThread");
    thread.setPriority(Thread.MAX_PRIORITY);
    System.out.println("Оновлене iм'я: " + thread.getName());
    System.out.println("Оновлений прiоритет: " + thread.getPriority());

    thread.join();
    System.out.println("Потiк завершився. Стан TERMINATED.");

    Thread mainThread = Thread.currentThread();
    System.out.println("Iм'я головного потоку: " + mainThread.getName());
    System.out.println("Прiоритет головного потоку: " + mainThread.getPriority());
}
}
