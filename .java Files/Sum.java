import java.util.*;

public class Sum {
  public static void main(String[] args) {
    int start = 0; // Start of the range
    int end = 10; // End of the range
    int sumEven = 0; // Initialize sum of even numbers
    int sumOdd = 0; // Initialize sum of odd numbers

    // Loop from start to end
    for (int i = start; i <= end; i++) {
      // Find if the number is even or odd
      if (i % 2 == 0) {
        sumEven += i; // Add even numbers to sumEven
      } else {
        sumOdd += i; // Add odd numbers to sumOdd
      }
    }

    // Print the sum of even and odd numbers
    System.out.println("Sum of even numbers in given range = " + sumEven);
    System.out.println("Sum of odd numbers in given range = " + sumOdd);
  }
}