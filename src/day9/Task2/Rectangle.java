package day9.Task2;

public class Rectangle extends Figure {
    private final int width;
    private final int heigh;

    public Rectangle(String color, int width, int heigh) {
        super(color);
        this.width = width;
        this.heigh = heigh;
    }

    @Override
    public double area() {
        return width * heigh;
    }

    @Override
    public double perimeter() {
        return 2 * (width + heigh);
    }
}
