import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = 0;
        int temp = num;

        while (temp != 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }

        int sum = num + reversedNum;
        int product = num * reversedNum;

        System.out.println("Sum of the number and its reverse: " + sum);
        System.out.println("Product of the number and its reverse: " + product);
    }
}