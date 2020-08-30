package day7.Task1;


public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Boing", 1999, 40, 3500);
        Plane plane2 = new Plane("TU", 2005, 38, 3900);

        System.out.println(Plane.planeDifference(plane1, plane2));

    }
}
