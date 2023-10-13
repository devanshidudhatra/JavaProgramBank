import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        printStringPyramid(input);
        
        scanner.close();
    }
    
    static void printStringPyramid(String str) {
        int length = str.length();
        
        for (int i = 0; i < length; i++) {
            // Print spaces
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("  ");
            }
            
            // Print characters
            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            
            System.out.println();
        }
    }
}
