package Laba6;
import java.io.*;

public class RandomFile {
    public static void main(String[] args) {
        String fileName = "products.txt";

        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            file.seek(file.length());
            file.writeBytes("\nProduct4, 150.5, 10");
            file.writeBytes("\nProduct5, 200.3, 5");

            file.seek(0);
            String line;
            System.out.println("Вміст файлу після змін:");
            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка роботи з файлом: " + e.getMessage());
        }
    }
}
