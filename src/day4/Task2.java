package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int max = array[0];
        int min = Integer.MAX_VALUE;
        int count = 0;
        int zeroSum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num % 10 == 0) {
                count++;
            }
            if (num % 10 == 0) {
                zeroSum = num + zeroSum;
            }
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("Сумма всех элементов массива 0: " + zeroSum);
    }
}

