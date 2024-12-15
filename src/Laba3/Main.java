package Laba3;

import game.Employee;
import game.Schoolar;
import game.Student;
import game.Team;


public class Main {
    public static void main(String[] args) throws Exception {
      Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);
        Team scollarTeam = new Team ("Dragon");
        scollarTeam.addNewParticipant(schoolar1);
        scollarTeam.addNewParticipant(schoolar2);
        scollarTeam.addNewParticipant(student1);
        scollarTeam.addNewParticipant(employee1);

        Team studentTeam = new Team("Vpered");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        Team employeeTeam = new Team("Robotyagi");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);
        Team anotherTeam = new Team("Fantaziya");
        anotherTeam.addNewParticipant("hello");

        Team scollarTeam2 = new Team("Rozumnyky");
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        scollarTeam2.addNewParticipant(schoolar3);
        scollarTeam2.addNewParticipant(schoolar4);
        scollarTeam.playWith(scollarTeam2);
        scollarTeam.playWith(employeeTeam);

        Team clonedScholarTeam = scollarTeam.cloneTeam();
        System.out.println("Original team: " + scollarTeam);
        System.out.println("Cloned team: " + clonedScholarTeam);

        System.out.println("Original team hashCode: " + scollarTeam.hashCode());
        System.out.println("Cloned team hashCode: " + clonedScholarTeam.hashCode());

        System.out.println("Teams are equal: " + scollarTeam.equals(clonedScholarTeam));

        System.out.println("Participants comparison:");
        System.out.println(schoolar1 + " hashCode: " + schoolar1.hashCode());
        System.out.println(schoolar2 + " hashCode: " + schoolar2.hashCode());
        System.out.println("scholar1 equals scholar2: " + schoolar1.equals(schoolar2));
    }
}
