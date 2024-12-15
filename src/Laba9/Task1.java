package Laba9;
import java.util.regex.*;

public class Task1 {
    public static void main(String[] args) {
        String text = "Іваненко Іван Іванович, 25 років, посада: Інженер, досвід: 3 роки, адреса: вул. Центральна 1, Київ, емайл: ivan.ivanenko@gmail.com, телефон: +380(67)123-45-67.\n"+
        "Петрова Марія Петрівна, 30 років, посада: Бухгалтер, досвід: 5 років, адреса: вул. Шевченка 10, Львів, емайл: maria.petrova@ukr.net, телефон: +380(50)987-65-43.\n";

        System.out.println("Телефони:");
        Pattern phonePattern = Pattern.compile("\\+380\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        while (phoneMatcher.find()) {
            System.out.println(phoneMatcher.group());
        }

        System.out.println("\nЕмайли:");
        Pattern emailPattern = Pattern.compile("\\b[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}\\b");
        Matcher emailMatcher = emailPattern.matcher(text);
        while (emailMatcher.find()) {
            System.out.println(emailMatcher.group());
        }

        System.out.println("\nОновлені дати народження:");
        String textWithDates =
        "Іваненко Іван Іванович, дата народження: 20.05.1995.\n"+
        "Петрова Марія Петрівна, дата народження: 15.08.1992.\n"+
        "Сидоренко Андрій Олексійович, дата народження: 01.01.1988";

        String updatedDates = textWithDates.replaceAll("(\\d{2})\\.(\\d{2})\\.(\\d{4})", "$3-$2-$1");
        System.out.println(updatedDates);

        System.out.println("Оновлені посади:");
        String updatedText = text.replaceAll("Інженер", "Старший інженер")
                                  .replaceAll("Бухгалтер", "Головний бухгалтер");
        System.out.println(updatedText);
    }
}
