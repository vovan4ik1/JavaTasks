package Laba9;
import java.lang.reflect.*;

class Employee {
  public String name;
  private int age;
  private String position;

  public Employee() {
  }

  public Employee(String name, int age, String position) {
      this.name = name;
      this.age = age;
      this.position = position;
  }

  public void work() {
      System.out.println(name + " is working as " + position);
  }

  private void setPosition(String position) {
      this.position = position;
  }

  private String getPosition() {
      return position;
  }
}

public class Task2 {
    public static void main(String[] args) throws Exception {
        Class<Employee> employeeClass = Employee.class;
        System.out.println("Class: " + employeeClass.getName());


        System.out.println("\nFields:");
        for (Field field : employeeClass.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nMethods:");
        for (Method method : employeeClass.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : employeeClass.getDeclaredConstructors()) {
            System.out.println(constructor);
        }


        Employee employee = employeeClass.getDeclaredConstructor().newInstance();

        employee.name = "Іваненко Іван";
        Method workMethod = employeeClass.getMethod("work");
        workMethod.invoke(employee);

        Field positionField = employeeClass.getDeclaredField("position");
        positionField.setAccessible(true);
        positionField.set(employee, "Інженер");

        Method getPositionMethod = employeeClass.getDeclaredMethod("getPosition");
        getPositionMethod.setAccessible(true);
        String position = (String) getPositionMethod.invoke(employee);
        System.out.println("Посада: " + position);
    }
}
