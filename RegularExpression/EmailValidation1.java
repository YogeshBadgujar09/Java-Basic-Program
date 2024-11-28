
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation1{

    String emailId = "yogesh@gmail.com";
   Pattern pattern = Pattern.compile( "^[a-zA-Z0-9_+&*-]+@" +  "[a-zA-Z0-9-]+" + "\\." + "[a-z" + "]{2,3}$");
   Matcher matcher = pattern.matcher(emailId);
   
   if(matcher.matches())
   {
       System.out.println("Valid email");
   }else{
        System.out.println("Not valid email ");
    }
 
}