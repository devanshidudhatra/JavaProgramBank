import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SearchAndReplace {
    public static void main(String[] args) {
        String inputFile = "input.txt";      // Replace with your input file name
        String outputFile = "output.txt";    // Replace with your output file name
        String searchWord = "oldWord";      // Replace with the word to search for
        String replaceWord = "newWord";     // Replace with the word to replace with

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile);
            String line;

            while ((line = reader.readLine()) != null) {
                // Replace the search word with the replace word in the line
                String modifiedLine = line.replace(searchWord, replaceWord);
                // Write the modified line to the output file
                writer.write(modifiedLine + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Word '" + searchWord + "' replaced with '" + replaceWord + "' and saved in '" + outputFile + "'");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
