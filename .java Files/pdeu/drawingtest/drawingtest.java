package pdeu.drawingtest;

import pdeu.drawing.*;

public class drawingtest {
    public static void highestArea
    (Shape[] shapes) {
        if (shapes.length == 0) {
            System.out.println("No shapes to find the highest area.");
            return;
        }

        Shape highestAreaShape = shapes[0];
        double highestArea = shapes[0].calculateArea();

        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            if (area > highestArea) {
                highestArea = area;
                highestAreaShape = shape;
            }
        }

        System.out.println("Shape with the highest area: " + highestAreaShape + ", Area: " + highestArea);
    }

    public static void resizableShapes(Shape[] shapes) {
        System.out.println("Shapes that allow resizing:");
        for (Shape shape : shapes) {
            if (shape instanceof Resizeable) {
                System.out.println(shape);
            }
        }
    }

    public static double totalDecorativeMaterialForCircle(Shape[] shapes) {
        double totalDecorativeMaterial = 0;

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                totalDecorativeMaterial += shape.calculatePerimeter();
            }
        }

        return totalDecorativeMaterial;
    }

    public static void main(String[] args) {
        // Create an array of shapes
        Shape[] shapes = {
            new Square("Red", "Striped", 5.0),
            new Rectangle("Blue", "Polka Dot", 4.0, 6.0),
            new Circle("Green", "Solid", 3.0),
            new Triangle("Yellow", "Checkerboard", 3.0, 4.0, 5.0),
            new ResizableSquare("Purple", "Plaid", 4.0)
        };

        highestArea(shapes);
        resizableShapes(shapes);
        double totalDecorativeMaterial = totalDecorativeMaterialForCircle(shapes);
        System.out.println("Total decorative material for circles: " + totalDecorativeMaterial);
    }
}
