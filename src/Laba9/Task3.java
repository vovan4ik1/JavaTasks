package Laba9;
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Documentation {
    String author() default "Anonymous";
    String version() default "1.0";
    String description() default "No description";
}

@Documentation(
        author = "Skala Jonson",
        version = "3.4.5",
        description = "Class guard"
)
class EmployeeAnnotated {
    private String name;
    private int age;

    public EmployeeAnnotated(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Task3 {
  public static void main(String[] args) {
    Class<EmployeeAnnotated> employeeClass = EmployeeAnnotated.class;

    if (employeeClass.isAnnotationPresent(Documentation.class)) {
        Documentation doc = employeeClass.getAnnotation(Documentation.class);

        System.out.println("Author: " + doc.author());
        System.out.println("Version: " + doc.version());
        System.out.println("Description: " + doc.description());
    }
}
}
