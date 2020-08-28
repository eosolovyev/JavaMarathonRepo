package day4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 50));
                System.out.print(array[i][j] + "   ");
            }
            int sum = Arrays.stream(array[i]).sum();
            System.out.println("  //  Сумма: " + sum);
        }

        int[] sumArray = new int[m];
        for (int i = 0; i < array.length; i++) {
            int sum = Arrays.stream(array[i]).sum();
            sumArray[i] = sum;
        }

        int max = sumArray[0];
        for (int num : sumArray) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Наибольшая сумма: " + max);


        for (int i = 0; i < sumArray.length; i++) {
            if (sumArray[i] == max) {
                System.out.println("Строка с наибольшей суммой: " + i);
            }
        }
    }
}