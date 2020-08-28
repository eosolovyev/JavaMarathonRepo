package day5.task1;

public class Task1 {
    public static void main(String[] args) {
        Automobile automobile = new Automobile();

        automobile.setColorAutomobile("Blue");
        automobile.setModelAutomobile("Focus");
        automobile.setYearAutomobile(15);

        System.out.println(automobile.getColorAutomobile());
        System.out.println(automobile.getModelAutomobile());
        System.out.println(automobile.getYearAutomobile());
    }
}
