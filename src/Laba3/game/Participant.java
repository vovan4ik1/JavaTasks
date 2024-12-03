package Laba3.game;

public abstract class Participant implements Cloneable, Comparable<Participant> {
    private String name;
    private int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Participant clone() {
      try {
        return (Participant) super.clone();
      }catch (CloneNotSupportedException e) {
        throw new AssertionError();
      }
    }

    public int compareTo(Participant other) {
      return this.name.compareTo(other.name);
    }

    @Override
    public int hashCode() {
      int result = 17;
      result = 31 * result + (name != null ? name.hashCode() : 0);
      result = 31 * result + age;
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Participant that = (Participant) obj;
      return age == that.age && (name != null ? name.equals(that.name) : that.name == null);
    }

    @Override
    public String toString() {
        return "Participant{name='" + name + "', age=" + age + "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
