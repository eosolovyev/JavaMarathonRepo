package day8;

public class Task1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        StringBuilder sb = new StringBuilder(y);

        long start1 = System.currentTimeMillis();
        while (x <= 20000) {
            System.out.print(x + " ");
            x++;
        }
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println();
        System.out.println(timeConsumedMillis1);

        long start2 = System.currentTimeMillis();
        while (y <= 20000) {
            sb.append(y).append(" ");
            y++;
        }
        System.out.print(sb.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println();
        System.out.println(timeConsumedMillis2);
    }
}