package pdeu.drawing;

import java.util.Objects;

class Square extends Shape {
    private double side;

    public Square(String color, String pattern, double side) {
        super(color, pattern);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
