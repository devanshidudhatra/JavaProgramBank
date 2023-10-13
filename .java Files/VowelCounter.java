import java.util.Scanner;

class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        
        while (true) {
            System.out.print("Enter a sentence (or 'quit' to exit): ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("quit")) {
                break;
            }
            
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                
                if (ch == 'a') {
                    countA++;
                    totalA++;
                } else if (ch == 'e') {
                    countE++;
                    totalE++;
                } else if (ch == 'i') {
                    countI++;
                    totalI++;
                } else if (ch == 'o') {
                    countO++;
                    totalO++;
                } else if (ch == 'u') {
                    countU++;
                    totalU++;
                }
            }
            
            System.out.println("Vowel count in this sentence:");
            System.out.println("A: " + countA);
            System.out.println("E: " + countE);
            System.out.println("I: " + countI);
            System.out.println("O: " + countO);
            System.out.println("U: " + countU);
        }
        
        System.out.println("Total vowel count for all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " +
