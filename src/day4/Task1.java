package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countMoreThanEight = 0;
        int countEqualOne = 0;
        int countEven = 0;
        int countNotEven = 0;
        int sum = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (array[i] > 8) {
                countMoreThanEight++;
            }
            if (array[i] == 1) {
                countEqualOne++;
            }
            if (array[i] % 2 == 0) {
                countEven++;
            }
            if (array[i] % 2 != 0) {
                countNotEven++;
            }
            sum += array[i];
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество нечетных чисел: " + countNotEven);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество чисел равных 1: " + countEqualOne);
        System.out.println("Количество чисел больше 8: " + countMoreThanEight);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
