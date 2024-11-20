import java.util.regex.Pattern ;
import java.util.regex.Matcher;

class EmailValidationDemo2
{

    public static boolean validateEmail(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$";

       Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static void main(String[] args)
    {

        String email = "test@example.com";
        if (validateEmail(email)) {
            System.out.println(email + " is a valid email address");
        } else {
            System.out.println(email + " is not a valid email address");
        }
    }
}