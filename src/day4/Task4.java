package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int m = 10;
        int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 50));
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));


        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(maxSumIndex);
    }
}


