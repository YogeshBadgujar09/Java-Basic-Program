import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExDemo1{
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Yogesh", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Rohit");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}