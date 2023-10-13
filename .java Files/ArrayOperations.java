import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        int product = 1;
        int max = array[0];
        int min = array[0];
        int countDivisibleBy15 = 0;

        for (int num : array) {
            sum += num;
            product *= num;

            if (num % 15 == 0) {
                countDivisibleBy15++;
            }

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        Arrays.sort(array);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Numbers divisible by 15: " + countDivisibleBy15);
        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        scanner.close();
    }
}
