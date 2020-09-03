package day11;

public class Courier implements Worker {
    private int salary;
    public int temp2;
    Warehouse warehouse = new Warehouse();

    public int getSalary() {
        return salary;
    }


    @Override
    public void doWork() {
        temp2 = temp2 + 1000;
        salary += 100;
        warehouse.setBalance(temp2);
    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() % 1000000 == 0) {
            salary += salary;
        }
    }
}
