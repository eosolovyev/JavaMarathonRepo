package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);

        int countMoreThanEight = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                countMoreThanEight++;
            }
        }
        System.out.println("Количество чисел больше 8: " + countMoreThanEight);

        int countEqualOne = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                countEqualOne++;
            }
        }
        System.out.println("Количество чисел равных 1: " + countEqualOne);

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Количество четных чисел: " + countEven);

        int countNotEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countNotEven++;
            }
        }
        System.out.println("Количество нечетных чисел: " + countNotEven);

        int sum = Arrays.stream(array).sum();
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
