package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (0 + Math.random() * 10000);
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));

        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("наибольший элемент массива: " + max);

        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("наименьший элемент массива: " + min);

        int count = 0;
        for (int num : array) {
            if (num % 10 == 0) {
                count++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);


        int zeroSum = 0;
        for (int num : array) {
            if (num % 10 == 0) {
                zeroSum = num + zeroSum;
            }
        }
        System.out.println("Сумма всех элементов массива 0: " + zeroSum);
    }
}



