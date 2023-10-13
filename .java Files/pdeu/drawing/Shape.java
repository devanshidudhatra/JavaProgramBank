// Create a package pdeu.drawing

package pdeu.drawing;

import java.util.Objects;

// Create an abstract class named "Shape" with fields color and pattern
public abstract class Shape {
    private String color;
    private String pattern;

    // Constructor
    public Shape(String color, String pattern) {
        this.color = color;
        this.pattern = pattern;
    }

    // Abstract methods
    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    // Static method to count shapes
    public static int countShapes() {
        // Implement the counting logic here
        return 0; // Placeholder value
    }

    // Override toString method from Object class
    @Override
    public String toString() {
        return "Color: " + color + ", Pattern: " + pattern;
    }
}

// Create classes Square, Rectangle, Circle, and Triangle derived from Shape
class Square extends Shape {
    double side;

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

class Circle extends Shape {
    double radius;

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

// Create an interface Resizeable
interface Resizeable {
    void resize(int factor);
}

// Square and Circle implement the Resizeable interface
class ResizableSquare extends Square implements Resizeable {
    public ResizableSquare(String color, String pattern, double side) {
        super(color, pattern, side);
    }

    @Override
    public void resize(int factor) {
        this.side *= factor;
    }
}

class ResizableCircle extends Circle implements Resizeable {
    public ResizableCircle(String color, String pattern, double radius) {
        super(color, pattern, radius);
    }

    @Override
    public void resize(int factor) {
        this.radius *= factor;
    }
}
