package day11;


public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        while (warehouse.getCountOrder() <= 6000) {
            picker.doWork();
            courier.doWork();

            picker.bonus();
            courier.bonus();
            if (warehouse.getCountOrder() % 1500 == 0) {
                System.out.println("Кол-во заказов: " + warehouse.getCountOrder()
                        + "\nБаланс: " + warehouse.getCountOrder()
                        + "\nЗП Сборщика: " + picker.getSalary()
                        + "\nЗП Курьера: " + courier.getSalary() + "\n-------------------------");
            }
        }
    }
}

