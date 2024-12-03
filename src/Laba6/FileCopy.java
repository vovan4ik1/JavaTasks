package Laba6;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успішно скопійовано: " + destinationFile);
        } catch (IOException e) {
            System.err.println("Помилка копіювання файлу: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream("source.txt");
             FileOutputStream outputStream = new FileOutputStream("destination.txt")) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            System.out.println("Зображення успішно скопійовано.");
        } catch (IOException e) {
            System.err.println("Помилка копіювання зображення: " + e.getMessage());
        }
    }
}
