import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class DynamicRegularEx1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out. println("Enter Mobile Number :");
		String mobNo = sc.next();

		Pattern pattern = Pattern.compile("^[0-9]{10}$");
		Matcher matcher = pattern.matcher(mobNo);
		System.out.println("Valid Data : " + matcher.matches());


	}


}