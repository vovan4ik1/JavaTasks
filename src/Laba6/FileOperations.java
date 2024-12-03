package Laba6;

import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        File directory = new File("inner_directory");
        if (directory.mkdir()) {
            System.out.println("Папка створена: " + directory.getAbsolutePath());
        }

        System.out.println("Батьківська директорія: " + directory.getParent());

        try {
            File file1 = new File(directory, "file1.txt");
            File file2 = new File(directory, "file2.txt");
            file1.createNewFile();
            file2.createNewFile();

            file2.delete();
            System.out.println("Файл " + file2.getName() + " видалено.");

            File renamedDirectory = new File("renamed_inner_directory");
            if (directory.renameTo(renamedDirectory)) {
                System.out.println("Папку перейменовано: " + renamedDirectory.getName());
            }

            File[] files = renamedDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName() + " - " + (file.isFile() ? "Файл" : "Папка") + ", Розмір: " + file.length());
                }
            }
        } catch (IOException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
