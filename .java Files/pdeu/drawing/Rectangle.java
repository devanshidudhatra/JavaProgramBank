package pdeu.drawing;

import java.util.Objects;
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, String pattern, double length, double width) {
        super(color, pattern);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
