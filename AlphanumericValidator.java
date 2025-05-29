import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class AlphanumericValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter alphanumeric value: ");
        String input = scanner.nextLine();

        String regex = "^[A-Za-z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Valid alphanumeric input.");
        } else {
            System.out.println("Invalid input. Only letters and numbers are allowed.");
        }

        scanner.close();
    }
}
