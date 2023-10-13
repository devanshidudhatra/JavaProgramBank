public class CountNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0 && i % 5 != 0 && i % 7 != 0) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}

// This program uses a simple loop that iterates over the numbers from 1 to 100. The if condition checks if the number is not divisible by 2, 5, and 7. If the condition is true, it increments the count variable. Finally, the program prints the value of count, which represents the total count of numbers that are not divisible by 2, 5, and 7.