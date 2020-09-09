package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList());

    }

    public static List<Person> parseFileToObjList() {

        List<Person> people = new ArrayList<>();
        File filePeople = new File("people.txt");
        try {
            Scanner scanner = new Scanner(filePeople);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] personArray = line.split(" ");

                if (Integer.parseInt(personArray[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                Person person = new Person(personArray[0], Integer.parseInt(personArray[1]));
                people.add(person);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException i) {
            System.out.println("Некорректный входной файл");

        }
        return null;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
