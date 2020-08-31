package day8.Task2;

public class Plane {
    private String producer;
    private int yearOfProduce;
    private int length;
    private int weight;
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

    public void info(String s) {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, объем топлива в баке: %d%n", producer, yearOfProduce, length, weight, fuelTank);
    }

    public void fillUp(int fuelNew) {
        fuelTank += fuelNew;
        System.out.println("Бак залит на: " + fuelNew);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "producer='" + producer + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                ", length=" + length +
                ", weight=" + weight +
                ", fuelTank=" + fuelTank +
                '}';
    }
}