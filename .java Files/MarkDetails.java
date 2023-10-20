import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MarkDetails {
    public static void main(String[] args) {
        // First, store the subject marks and student names in the "markdetails.txt" file.
        storeMarkDetails();

        // Now, read the file and print the names of students with marks greater than 70.
        readAndPrintNamesWithMarksGreaterThan70();
    }

    public static void storeMarkDetails() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("markdetails.txt"));
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter the number of records:");
            int numRecords = scanner.nextInt();
            
            for (int i = 0; i < numRecords; i++) {
                System.out.println("Enter student name: ");
                String name = scanner.next();
                
                System.out.println("Enter subject mark: ");
                int mark = scanner.nextInt();
                
                writer.write(name + " " + mark + "\n");
            }
            
            writer.close();
            System.out.println("Mark details stored in 'markdetails.txt'.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void readAndPrintNamesWithMarksGreaterThan70() {
        try {
            File file = new File("markdetails.txt");
            Scanner scanner = new Scanner(file);
            
            System.out.println("Students with marks greater than 70:");
            
            while (scanner.hasNext()) {
                String name = scanner.next();
                int mark = scanner.nextInt();
                
                if (mark > 70) {
                    System.out.println(name);
                }
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File 'markdetails.txt' not found: " + e.getMessage());
        }
    }
}
