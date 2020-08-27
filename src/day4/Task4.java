package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int m = 10;
        int[] array = new int[m];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (0 + Math.random() * 5));
        }
        System.out.println("Сгененированный массив: " + Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {
            int count1 = array[i];
            int count2 = array[i + 1];
            int count3 = array[i + 2];
            int sum = count1 + count2 + count3;
//            int nextSum;
//            if (sum > nextSum)
//                nextSum = sum;
//                System.out.println(nextSum);
            }
        }
    }


