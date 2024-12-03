package Laba1;

public class Task7 {
  public void displayAlphabetWithCodes() {
    char[] alphabet = new char[26];

    for (int i = 0; i < 26; i++) {
        alphabet[i] = (char) ('A' + i);
    }

    for (char letter : alphabet) {
        int code = (int) letter;
        System.out.println(letter + " ==> " + code);
    }
}

public static void main(String[] args) {
    Task7 task = new Task7();
    task.displayAlphabetWithCodes();
}
}
