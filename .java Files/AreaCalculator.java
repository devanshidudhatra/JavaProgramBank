// Using Method Overloading
import java.util.Scanner;

public class AreaCalculator{

    public static double calculatedArea(double l, double b){
        return l*b;
    }

    public static double calculatedArea(int s , double l, double h){
        return (l*h)/2 ;
    }

    public static double calculatedArea(double r){
        return 3.14 * r *r ;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

            System.out.println("*******************************");
            System.out.println("*       Select a Figure:      *");
            System.out.println("*       1  ->  Rectangle      *");
            System.out.println("*       2  ->  Triangle       *");
            System.out.println("*        3  ->  Circle        *");
            System.out.println("*******************************");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the length : ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width : ");
                    double width = scanner.nextDouble();
                    double rectangleArea = calculatedArea(length,width);
                    System.out.println("The area of Rectangle is : " + rectangleArea);
                    break;
                
                case 2:
                    int sides = 3;
                    System.out.print("Enter the base : ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height : ");
                    double height = scanner.nextDouble();
                    double triangleArea = calculatedArea(sides,base,height);
                    System.out.println("The area of Triangle is : " + triangleArea);
                    break;
                
                case 3:
                    System.out.print("Enter the radius : ");
                    double radius = scanner.nextDouble();
                    double circleArea = calculatedArea(radius);
                    System.out.println("The area of Circle is : " + circleArea);
                    break;

                default:
                    System.out.println("Invalid Choice !!!");
                    break;
            }
            scanner.close();
        }
    }
    