package Laba2.Task1;

public class Employee extends Person {
  private String jobTitle;
  private Car car;

  public Employee(String firstName, String lastName, int age, Location location, Gender gender, String jobTitle, Car car) {
      super(firstName, lastName, age, location, gender);
      this.jobTitle = jobTitle;
      this.car = car;
  }


  @Override
  public String getOccupation() {
      return "Worker on jobTitle: " + jobTitle;
  }

  public Car getCar() {
      return car;
  }
}
