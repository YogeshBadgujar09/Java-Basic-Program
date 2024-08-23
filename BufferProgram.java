import java.util.Scanner;

public class BufferProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create a buffer
        StringBuffer buffer = new StringBuffer(input);

        // Append to the buffer
        buffer.append(" is a nice string!");

        // Insert into the buffer
        buffer.insert(0, "This ");

        // Replace in the buffer
        buffer.replace(5, 10, "great");

        // Reverse the buffer
        buffer.reverse();

        System.out.println(buffer.toString());
    }
}
