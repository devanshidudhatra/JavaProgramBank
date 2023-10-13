package pdeu.drawing;

import java.util.Objects;

class Circle extends Shape {
    private double radius;

    public Circle(String color, String pattern, double radius) {
        super(color, pattern);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
