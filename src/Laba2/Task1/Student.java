package Laba2.Task1;
public class Student extends Person {
  private String senior;

  public Student(String firstName, String lastName, int age, Location location, Gender gender, String senior) {
      super(firstName, lastName, age, location, gender);
      this.senior = senior;
  }

  public String getSenior() {
      return senior;
  }

  public String getOccupation() {
      return "Student speciality: " + senior;
  }
}
