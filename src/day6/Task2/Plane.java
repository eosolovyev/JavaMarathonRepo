package day6.Task2;

import java.util.Scanner;

public class Plane {
    String producer;
    int yearOfProduce;
    int length;
    int weight;
    int fuelTank = 0;

    public Plane(String producer, int yearOfProduce, int length, int weight) {
        this.producer = "Tu";
        this.yearOfProduce = 1956;
        this.length = 12;
        this.weight = 35;
    }

    public void setYearOfProduce(int yearOfProduce) {
        this.yearOfProduce = yearOfProduce;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, объем топлива в баке: %d%n", producer, yearOfProduce, length, weight, fuelTank);
    }


    public void fillUp(int fuelNew) {
        fuelTank += fuelNew + ((int) (Math.random() * 20));
        System.out.println("Бак залит на: " + fuelTank);
    }
}