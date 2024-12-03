package Laba4;

public class Task1 {
  public static void processString(String input) {
    System.out.println("Останнiй символ рядка: " + input.charAt(input.length() - 1));
    System.out.println("Чи закiнчується на \"!!!\": " + input.endsWith("!!!"));
    System.out.println("Чи починається з \"I learn \": " + input.startsWith("I learn "));
    System.out.println("Чи мiстить \"Java\": " + input.contains("Java"));

    int javaIndex = input.indexOf("Java");
    System.out.println("Позицiя \"Java\" у рядку: " + javaIndex);

    String replacedString = input.replace('a', 'o');
    System.out.println("Замiнити \"a\" на \"o\": " + replacedString);

    System.out.println("У верхньому регiстрi: " + input.toUpperCase());
    System.out.println("У нижньому регiстрi: " + input.toLowerCase());

    String withoutJava = input.replace("Java", "");
    System.out.println("Рядок без \"Java\": " + withoutJava);
}

public static void main(String[] args) {
    String testString = "I learn Java!!!";
    processString(testString);
}
}
