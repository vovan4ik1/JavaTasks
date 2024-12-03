package Laba6;

import java.io.*;
import java.util.Scanner;

public class File {
  public static void main(String[] args) {
    String report = "Report for sales:\n" +
        "====================================\n" +
        "N   Name         Price($)   Quantity\n" +
        "1   Smartphone   10000         5\n" +
        "2   Laptop       8000          3\n" +
        "3   PC           6000          7\n" +
        "====================================\n" +
        "Total: 24000 $";

        String ReportFile = "report.txt";

    try {
      FileWriter writer = new FileWriter(ReportFile);
      writer.write(report);
      writer.close();
      System.out.println("Звіт записано у файл: " + ReportFile);
    } catch (IOException e) {
      System.err.println("Помилка запису у файл: " + e.getMessage());
    }

    try {
      FileReader reader = new FileReader(ReportFile);
      BufferedReader bufferedReader = new BufferedReader(reader);
      String line;
      System.out.println("Читання звіту:");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
      bufferedReader.close();
    } catch (IOException e) {
      System.err.println("Помилка читання з файлу: " + e.getMessage());
    }
  }
}
