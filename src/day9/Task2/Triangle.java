package day9.Task2;

public class Triangle extends Figure {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public double area() {
        int p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
