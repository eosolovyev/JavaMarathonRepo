package day11;

public class Picker implements Worker {
    private int salary;
    private int temp1;
    Warehouse warehouse = new Warehouse();

    public int getSalary() {
        return salary;
    }

    public int getTemp1() {
        return temp1;
    }

    @Override
    public void doWork() {
        temp1++;
        salary += 80;
        warehouse.setCountOrder(getTemp1());
    }


    @Override
    public void bonus() {
        if (warehouse.getCountOrder() % 1500 == 0) {
            salary = salary * 3;
        }
    }
}
