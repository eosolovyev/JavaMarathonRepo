package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList());
    }

    public static List<String> parseFileToStringList() {

        List<String> people = new ArrayList<>();
        File filePeople = new File("people.txt");
        try {
            Scanner scanner = new Scanner(filePeople);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                people.add(line);
                String[] persons = line.split(" ");
                if (Integer.parseInt(persons[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            scanner.close();
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i) {
            System.out.println("Некорректный входной файл");

        }
        return null;
    }
}