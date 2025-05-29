import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class NameValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full name: ");
        String input = scanner.nextLine();

        // Regex: Only letters and single spaces between words
        String regex = "^[A-Za-z]+(\\s[A-Za-z]+)*$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid name: " + input);
        } else {
            System.out.println("Invalid name. Only letters and single spaces are allowed.");
        }

        scanner.close();
    }
}
