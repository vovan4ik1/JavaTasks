package Laba2.Task1;
public class Teacher extends Person {
  private String subject;
  private Car car;

  public Teacher(String firstName, String lastName, int age, Location location, Gender gender, String subject, Car car) {
      super(firstName, lastName, age, location, gender);
      this.subject = subject;
      this.car = car;
  }

  public String getOccupation() {
      return "Learn Subject: " + subject;
  }

  public Car getCar() {
      return car;
  }
}
