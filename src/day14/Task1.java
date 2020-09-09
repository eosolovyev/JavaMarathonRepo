package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File textFile = new File("test");
        try {
            Scanner scanner = new Scanner(textFile);
            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");
            if (numbersString.length != 10)
                throw new IllegalArgumentException();

            int sum = 0;
            for (String number : numbersString) {
                sum += Integer.parseInt(number);
            }
            System.out.println("Сумма чисел: " + sum);
            scanner.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Файл не найден");
            e1.printStackTrace();
        } catch (IllegalArgumentException e2) {
            System.out.println("Чисел не 10");
            e2.printStackTrace();
        }
    }
}
