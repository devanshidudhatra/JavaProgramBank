import java.io.*;

public class FileEncryption {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileEncryption <inputFileName>");
            return;
        }

        String inputFileName = args[0]; // cmd-line argu
        int encryptionKey = 10;  // You can change the encryption key as needed

        try {
            // Encrypt the file
            String encryptedFileName = inputFileName + ".enc";
            encryptFile(inputFileName, encryptedFileName, encryptionKey);
            System.out.println("File encrypted and saved as '" + encryptedFileName + "'");

            // Decrypt the file
            String decryptedFileName = inputFileName + ".dec";
            decryptFile(encryptedFileName, decryptedFileName, encryptionKey);
            System.out.println("File decrypted and saved as '" + decryptedFileName + "'");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void encryptFile(String inputFile, String outputFile, int key) throws IOException {
        try (InputStream is = new FileInputStream(inputFile);
             OutputStream os = new FileOutputStream(outputFile)) {
            encrypt(is, os, key);
        }
    }

    public static void decryptFile(String inputFile, String outputFile, int key) throws IOException {
        try (InputStream is = new FileInputStream(inputFile);
             OutputStream os = new FileOutputStream(outputFile)) {
            decrypt(is, os, key);
        }
    }

    public static void encrypt(InputStream is, OutputStream os, int key) throws IOException {
        int data;
        while ((data = is.read()) != -1) {
            data = data + key;
            os.write(data);
        }
    }

    public static void decrypt(InputStream is, OutputStream os, int key) throws IOException {
        int data;
        while ((data = is.read()) != -1) {
            data = data - key;
            os.write(data);
        }
    }
}
