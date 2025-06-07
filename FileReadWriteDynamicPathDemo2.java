import java.io.*;
import java.util.Scanner;

public class FileReadWriteDynamicPathDemo2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get file path from user
            System.out.print("Enter the file path to write to: ");
            String writePath = scanner.nextLine();

            // Write to the file
            System.out.println("Enter the content to write:");
            String content = scanner.nextLine();

            FileWriter writer = new FileWriter(writePath);
            writer.write(content);
            writer.close();
            System.out.println("Content written to file successfully.");

            // Get file path from user again for reading
            System.out.print("Enter the file path to read from: ");
            String readPath = scanner.nextLine();

            // Read from the file
            FileReader reader = new FileReader(readPath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Reading file content:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
