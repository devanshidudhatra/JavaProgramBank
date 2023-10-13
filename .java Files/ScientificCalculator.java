import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("*******************************");
            System.out.println("*     Select a Operation:     *");
            System.out.println("*      1  -> Square Root      *");
            System.out.println("*        2  ->  Power         *");
            System.out.println("*      3  ->  Cube Root       *");
            System.out.println("*      4  ->  Logarithm       *");
            System.out.println("*******************************");

            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num = scanner.nextDouble();
                    double sqrtResult = Math.sqrt(num);
                    System.out.println("Square Root: " + sqrtResult);
                    break;
                
                case 2:
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    double powerResult = Math.pow(base, exponent);
                    System.out.println("Power: " + powerResult);
                    break;
                
                case 3:
                    System.out.print("Enter a number: ");
                    double cubeRootNum = scanner.nextDouble();
                    double cubeRootResult = Math.cbrt(cubeRootNum);
                    System.out.println("Cube Root: " + cubeRootResult);
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    double logNum = scanner.nextDouble();
                    double logResult = Math.log(logNum);
                    System.out.println("Logarithm: " + logResult);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                
            }
             scanner.close();
        }
      
    }
    

