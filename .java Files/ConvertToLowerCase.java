import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        String inputFile = "input.txt";  // Replace with your input file name
        String outputFile = "output.txt";  // Replace with your output file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);
            String line;

            while ((line = reader.readLine()) != null) {
                // Convert the line to lowercase
                String lowercaseLine = line.toLowerCase();
                // Write the lowercase line to the output file
                writer.write(lowercaseLine + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Contents of '" + inputFile + "' converted to lowercase and saved in '" + outputFile + "'");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
