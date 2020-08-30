package day6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle(1998, "Yellow", "BMW");

        car.setColorCar("Blue");
        car.setModelCar("Focus");
        car.setYearCar(2015);

        car.thisCar();
        motorcycle.thisMotorcycle();

        int yearNew = 2020;
        System.out.println("Разница лет для авто: " + car.carDifference(yearNew));
        System.out.println("Разница лет для мотоцикла: " + motorcycle.motorcycleDifference(yearNew));
    }
}
