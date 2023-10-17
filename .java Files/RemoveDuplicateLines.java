import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class RemoveDuplicateLines {
    public static void main(String[] args) {
        String sourceFile = "input.txt";      // Replace with your source file name
        String outputFile = "output.txt";      // Replace with your output file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            FileWriter writer = new FileWriter(outputFile);
            String line;
            HashSet<String> uniqueLines = new HashSet<>();

            while ((line = reader.readLine()) != null) {
                // Check if the line is not in the set of unique lines
                if (uniqueLines.add(line)) {
                    writer.write(line + "\n"); // Write the unique line to the output file
                }
            }

            reader.close();
            writer.close();

            System.out.println("Duplicate lines removed from '" + sourceFile + "' and saved in '" + outputFile + "'");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
