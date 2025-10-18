import java.io.*;
import java.util.Scanner;

public class FileOperations {

    // Method to write to a file
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Method to read from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to modify file (append text)
    public static void modifyFile(String fileName, String newContent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.newLine(); // Start from new line
            writer.write(newContent);
            System.out.println("File modified (content appended) successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while modifying the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "sample.txt"; // File name

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Write to file");
            System.out.println("2. Read file");
            System.out.println("3. Modify file (Append text)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter content to write: ");
                    String content = sc.nextLine();
                    writeFile(fileName, content);
                    break;

                case 2:
                    readFile(fileName);
                    break;

                case 3:
                    System.out.print("Enter content to append: ");
                    String newContent = sc.nextLine();
                    modifyFile(fileName, newContent);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}