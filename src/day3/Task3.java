package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите делимое");
            double dividend = scanner.nextDouble();
            System.out.println("Введите делитель");
            double divisor = scanner.nextDouble();
            while (divisor != 0) {
                double result = dividend / divisor;
                System.out.println("Итог вычисления: " + result);
                break;
            }
            if (divisor == 0) {
                System.out.println("Деление на ноль");
            }
        }
    }
}

