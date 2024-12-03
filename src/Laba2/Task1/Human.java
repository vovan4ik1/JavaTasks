package Laba2.Task1;
public interface Human {
  void sayFullName();
    void sayAge();
    void sayLocation();
    void sayGender();

    default void whoIAm() {
        System.out.println("Hello i am");
    }
}
