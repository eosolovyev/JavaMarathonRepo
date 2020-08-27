package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {
            System.out.println("Введите делимое");
            double dividend = scanner.nextDouble();
            System.out.println("Введите делитель");
            double divisor = scanner.nextDouble();

            counter++;

            if (divisor == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            double result = dividend / divisor;
            System.out.println("Итог вычисления: " + result);
        }
    }
}