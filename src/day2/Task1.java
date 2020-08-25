package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите любое число");
        Scanner scanner = new Scanner(System.in);
        int levelOfHouse = scanner.nextInt();
        if (levelOfHouse >= 1 && levelOfHouse <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (levelOfHouse >= 5 && levelOfHouse <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (levelOfHouse >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (levelOfHouse < 1) {
            System.out.println("Ошибка! Это уже не дом");
        }
    }
}
