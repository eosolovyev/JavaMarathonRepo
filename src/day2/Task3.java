package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        while (num1 <= num2) {
            num1++;
            if (num1 % 5 == 0 && num1 % 10 != 0) {
                System.out.println(num1);
            }
        }
    }
}