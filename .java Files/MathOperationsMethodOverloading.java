class MathOperations {
    // Method for addition
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }

    // Method for multiplication
    public int performOperation(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    // Method for division
    public double performOperation(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero!");
            return Double.NaN; // Not-a-Number result
        }
    }
}

public class MathOperationsMethodOverloading {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        int result1 = mathOps.performOperation(5, 3);
        System.out.println("Result of addition: " + result1);

        int result2 = mathOps.performOperation(2, 3, 4);
        System.out.println("Result of multiplication: " + result2);

        double result3 = mathOps.performOperation(10.0, 2.5);
        System.out.println("Result of division: " + result3);
    }
}
