package day5.task2;

public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(15, "Yellow", "BMW");

        System.out.println(motorcycle.getColorMotorcycle());
        System.out.println(motorcycle.getModelMotorcycle());
        System.out.println(motorcycle.getYearMotorcycle());
    }
}

class Motorcycle {
    private final int yearMotorcycle;
    private final String colorMotorcycle;
    private final String modelMotorcycle;

    public Motorcycle(int yearMotorcycle, String colorMotorcycle, String modelMotorcycle) {
        this.yearMotorcycle = yearMotorcycle;
        this.colorMotorcycle = colorMotorcycle;
        this.modelMotorcycle = modelMotorcycle;
    }

    public int getYearMotorcycle() {
        return yearMotorcycle;
    }

    public String getColorMotorcycle() {
        return colorMotorcycle;
    }

    public String getModelMotorcycle() {
        return modelMotorcycle;
    }
}


