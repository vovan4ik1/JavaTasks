package Laba6;

import java.io.*;
import java.util.zip.*;

public class Zip {
    public static void main(String[] args) {
        String sourceDir = "directory_for_files";
        String zipFile = "archive.zip";

        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {
            File dir = new File(sourceDir);
            for (File file : dir.listFiles()) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    ZipEntry zipEntry = new ZipEntry(file.getName());
                    zipOut.putNextEntry(zipEntry);

                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len = fis.read(buffer)) > 0) {
                        zipOut.write(buffer, 0, len);
                    }
                    zipOut.closeEntry();
                }
            }
            System.out.println("Файли успішно додано до архіву: " + zipFile);
        } catch (IOException e) {
            System.err.println("Помилка створення архіву: " + e.getMessage());
        }

        try (ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFile))) {
            ZipEntry entry;
            System.out.println("Вміст архіву:");
            while ((entry = zipIn.getNextEntry()) != null) {
                System.out.println("Файл: " + entry.getName());
            }
        } catch (IOException e) {
            System.err.println("Помилка читання архіву: " + e.getMessage());
        }
    }
}
