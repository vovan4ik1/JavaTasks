package Laba2.Task1;

public class Main {
  public static void main(String[] args) {
      Student student = new Student("FisrtName: Vladyslav", "lastName: Leos", 20, Location.CITY, Gender.MALE, "Web-developer");
      Car carForTeacher = new Car("Toyota", "Lanzer");
      Teacher teacher = new Teacher("FisrtName: Maruna", "lastName: Markovna", 35, Location.TOWN, Gender.FEMALE, "Ukr-language, History", carForTeacher);
      Car carForEmployee = new Car("Ford", "Kuga");
      Employee employee = new Employee("FisrtName: Oleg", "lastName: Ivanov", 40, Location.VILLAGE, Gender.MALE, "Pr-manandger", carForEmployee);

    
      System.out.println(student.getFullInfo());
      System.out.println(teacher.getFullInfo());
      System.out.println(employee.getFullInfo());

      Car.Engine teacherEngine = teacher.getCar().new Engine();
      teacherEngine.startEngine();
      System.out.println("Teacher's car engine running: " + teacherEngine.isEngineWorks());

      Person.showCounter();

      if (teacher instanceof Person) {
          System.out.println("Teacher is an instance of Person.");
      }
  }
}
