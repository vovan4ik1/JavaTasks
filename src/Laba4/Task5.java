package Laba4;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class Task5 {
    public static void main(String[] args) {
        LocalDateTime labStart = LocalDateTime.of(2024, 11, 11, 10, 0, 0);
        System.out.println("Дата та час початку лабораторної: " + labStart);

        System.out.println("День тижня: " + labStart.getDayOfWeek());
        System.out.println("День у роцi: " + labStart.getDayOfYear());
        System.out.println("Мiсяць: " + labStart.getMonth());
        System.out.println("Рiк: " + labStart.getYear());
        System.out.println("Години: " + labStart.getHour());
        System.out.println("Хвилини: " + labStart.getMinute());
        System.out.println("Секунди: " + labStart.getSecond());

        boolean isLeapYear = Year.of(labStart.getYear()).isLeap();
        System.out.println("Чи рiк високосний: " + isLeapYear);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\nПоточний час: " + currentDateTime);

        if (currentDateTime.isAfter(labStart)) {
            System.out.println("Поточний час після початку лабораторної.");
        } else if (currentDateTime.isBefore(labStart)) {
            System.out.println("Поточний час до початку лабораторної.");
        } else {
            System.out.println("Поточний час співпадає з початком лабораторної.");
        }

        LocalDateTime modifiedDateTime = labStart
                .plusDays(1)
                .minusHours(2)
                .withMinute(45);

        System.out.println("\nЗмінена дата та час: " + modifiedDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Форматована змiнена дата та час: " + modifiedDateTime.format(formatter));
    }
}
