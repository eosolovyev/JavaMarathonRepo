package day11;


public class Task1 {
    public static void main(String[] args) {
        Courier courier = new Courier();
        Picker picker = new Picker();
        Warehouse warehouse = new Warehouse();

        while (warehouse.getCountOrder() <= 6000) {
            picker.doWork();
            picker.bonus();

            courier.doWork();
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

