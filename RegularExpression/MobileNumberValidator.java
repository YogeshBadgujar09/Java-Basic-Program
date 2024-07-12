import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {
    
    private static final String MOBILE_NUMBER_PATTERN = "^((\\+91)?|0)?[6789]{1}[0-9]{9}$";

    public static boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String mobileNumber = "9876543210";
        if (validateMobileNumber(mobileNumber)) {
            System.out.println(mobileNumber + " is a valid mobile number");
        } else {
            System.out.println(mobileNumber + " is not a valid mobile number");
        }
    }
}
