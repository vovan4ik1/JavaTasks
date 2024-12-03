package Laba2.Task1;
public class Car {
  private String brand;
  private String model;

  public class Engine {
      private boolean isRunning;

      public void startEngine() {
          isRunning = true;
          System.out.println("Engine started.");
      }

      public void stopEngine() {
          isRunning = false;
          System.out.println("Engine stopped.");
      }

      public boolean isEngineWorks() {
          return isRunning;
      }
  }

  public Car(String brand, String model) {
      this.brand = brand;
      this.model = model;
  }

  public String getCarInfo() {
      return brand + " " + model;
  }
}
