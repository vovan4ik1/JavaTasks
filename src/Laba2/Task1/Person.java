package Laba2.Task1;

public abstract class Person implements Human {
    private String firstName;
    private String lastName;
    private int age;
    protected Location location;
    protected Gender gender;
    private static int counter = 0;

    {
        this.firstName = "DefaultFirstName";
        this.lastName = "DefaultLastName";
        this.age = 18;
        this.location = Location.CITY;
        this.gender = Gender.MALE;
        counter++;
    }

    public Person() {}

    public Person(String firstName, String lastName, int age, Location location, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
        this.gender = gender;
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void showCounter() {
        System.out.println("Value create objects: " + counter);
    }

    public String getFullInfo() {
        return firstName + " " + lastName + ", " + age + " age, " + gender + ", location: " + location;
    }

    public abstract String getOccupation();

    public void sayFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public void sayAge() {
        System.out.println("Age: " + age);
    }

    public void sayLocation() {
        System.out.println("Location: " + location);
    }

    public void sayGender() {
        System.out.println("Gender: " + gender);
    }
}