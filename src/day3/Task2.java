package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите делимое");
            double dividend = scanner.nextDouble();
            System.out.println("Введите делитель");
            double divisor = scanner.nextDouble();
            if (divisor == 0) {
                System.out.println("Stop");
                break;
            }
            double result = dividend / divisor;
            System.out.println("Итог вычисления: " + result);
        }
    }
}
