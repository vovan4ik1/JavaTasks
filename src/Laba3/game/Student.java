package Laba3.game;

public class Student  extends Participant{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Scholar{" + "name='" + getName() + "', age=" + getAge() + "}";
    }
}
