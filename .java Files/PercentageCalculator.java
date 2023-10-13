import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the marks for 6 subjects:");
        
        int totalSubjects = 6;
        int totalMarks = 600; // Assuming each subject has a maximum of 100 marks
        
        int totalObtainedMarks = 0;
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            int subjectMarks = scanner.nextInt();
            totalObtainedMarks += subjectMarks;
        }
        
        double percentage = ((double) totalObtainedMarks / totalMarks) * 100;
        
        System.out.println("Total Obtained Marks: " + totalObtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
        
        scanner.close();
    }
}
