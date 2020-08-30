package day7.Task1;

public class Plane {
    private final String producer;
    private int yearOfProduce;
    private int length;
    private final int weight;
    private int fuelTank;

    public Plane(String producer, int yearOfProduce, int length, int weight) {
        this.producer = producer;
        this.yearOfProduce = yearOfProduce;
        this.length = length;
        this.weight = weight;
        this.fuelTank = 0;
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
        fuelTank += fuelNew;
        System.out.println("Бак залит на: " + fuelNew);
    }

    public static String planeDifference(Plane plane1, Plane plane2) {
        if (plane1.length > plane2.length) {
            return "Самолет 1 длиннее";
        } else {
            return "Самолет 2 длиннее";
        }
    }
}
