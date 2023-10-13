package pdeu.drawing;

import java.util.Objects;
class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, String pattern, double side1, double side2, double side3) {
        super(color, pattern);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculateArea() {
        // Implement area calculation for a triangle
        return 0; // Placeholder value
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
