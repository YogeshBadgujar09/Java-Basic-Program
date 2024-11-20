import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name :");
        String firstName = scanner.next();

        Pattern pattern = Pattern.compile("[A-Za-z]{1,10}");
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
        {
            System.out.println("This string contain only character");
        }
        else {
            System.out.println("This string contain alphanumeric character");
        }

    }
}