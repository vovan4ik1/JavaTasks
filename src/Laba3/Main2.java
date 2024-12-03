package Laba3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import game.Age;
import game.Participant;
import game.Priority;
import game.Student;

public class Main2 {
  public static void main(String[] args) {
        Student p1 = new Student("Mariya", 18);
        Student p2 = new Student("Mykola", 20);
        Student p3 = new Student("Viktoria", 21);
        Student p4 = new Student("Andriy", 28);
        Student p5 = new Student("Oksana", 25);
        Student p6 = new Student("Vladyslav", 25);

        List<Student> participants = new ArrayList<>();
        participants.add(p1);
        participants.add(p2);
        participants.add(p3);
        participants.add(p4);
        participants.add(p5);
        participants.add(p6);

        Collections.sort(participants);
        System.out.println("Sort on name:");
        participants.forEach(System.out::println);

        participants.sort(new Age());
        System.out.println("\nSort of age:");
        participants.forEach(System.out::println);

        participants.sort(Priority.byNameThenAge);
        System.out.println("\nSort of name , then of age");
        participants.forEach(System.out::println);
   }
}
