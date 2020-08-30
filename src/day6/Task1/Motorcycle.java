package day6.Task1;

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

    public void thisMotorcycle() {
        System.out.println("Это мотоцикл");
    }


    public int motorcycleDifference(int yearNew) {
        return yearNew - yearMotorcycle;
    }
}


