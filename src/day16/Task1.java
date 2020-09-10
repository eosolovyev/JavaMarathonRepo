package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += Integer.parseInt(array[i]);
            }
            double average = (double) sum / (double) array.length;
            System.out.printf(average + "--> %.3f", average);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

