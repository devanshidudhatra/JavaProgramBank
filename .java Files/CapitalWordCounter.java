import java.util.Scanner;

public class CapitalWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a line: ");
        String input = scanner.nextLine();
        
        int capitalWordCount = 0;
        
        String[] words = input.split("\\s+"); // Split the input line into words using whitespace as delimiter
        
        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                capitalWordCount++;
            }
        }
        
        System.out.println("Number of words starting with capital letters: " + capitalWordCount);
        
        scanner.close();
    }
}
