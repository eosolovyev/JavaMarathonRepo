package day6.Task2;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("Boing", 1999, 25, 3500);

        plane.setYearOfProduce(2010);
        plane.setLength(55);

        int fuelNewNew = 10;

        for (int i = 0; i < 2; i++) {
            plane.fillUp(fuelNewNew);
        }
        plane.info();
    }
}