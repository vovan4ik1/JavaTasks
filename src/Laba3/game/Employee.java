package Laba3.game;

public class Employee extends Participant{
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Scholar{" + "name='" + getName() + "', age=" + getAge() + "}";
    }
}
