package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> carsList = new ArrayList<>();
        carsList.add("Audi");
        carsList.add("BMW");
        carsList.add("Mercedes");
        carsList.add("Hyundai");
        carsList.add("Kia");

        System.out.println(carsList);

        carsList.add(2,"Mazda");
        System.out.println(carsList);

        carsList.remove(0);
        System.out.println(carsList);
    }
}
