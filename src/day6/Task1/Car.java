package day6.Task1;


public class Car {
    private int yearCar;
    private String colorCar;
    private String modelCar;

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearAuto) {
        yearCar = yearAuto;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorAuto) {
        colorCar = colorAuto;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelAuto) {
        modelCar = modelAuto;
    }

    public Car() {
    }

    public void thisCar() {
        System.out.println("Это автомобиль");
    }


    public int carDifference(int yearNew) {
        return yearNew - yearCar;
    }
}