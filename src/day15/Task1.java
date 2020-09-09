package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File inputFile = new File("shoes.csv");
        File outputFile = new File("shoesNew");
        Scanner inputFileScanner = null;
        try {
            inputFileScanner = new Scanner(inputFile);
            PrintWriter pw = new PrintWriter(outputFile);
            while (inputFileScanner.hasNextLine()) {
                String line = inputFileScanner.nextLine();
                String[] bootsArray = line.split(";");
                if (Integer.parseInt(bootsArray[2]) == 0) {
                    pw.println(bootsArray[0] + ", " + bootsArray[1] + ", " + bootsArray[2]);
                }
            }
            pw.close();
            inputFileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
