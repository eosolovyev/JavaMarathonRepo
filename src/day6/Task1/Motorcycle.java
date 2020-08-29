package day6.Task1;

class Motorcycle {
    private int yearMotorcycle;
    private String colorMotorcycle;
    private String modelMotorcycle;


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

    int yearNew = 1980;
    public void motorcycleDifference() {
        int x = yearMotorcycle - yearNew;
        System.out.println("Разница лет для мотоцикла: " + x);
    }
}


