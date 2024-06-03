import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class DyanamicRegularEx
{

	public static void main(String args[])
	{
			Scanner sc = new Scanner(System.in);

			//Declare a name object for Validation
			String name = "^[A-Za-z]{3,}";

			//Take input which compare with validate Object
			System.out.println("Enter Name :");
			String s_name = sc.next();

			//System.out.println(name);

			/*Patter is inbuilt Class in util.regex package
			*Pattern.compile(name)  -  compile is static function which tell to compiler this is not normal object
			*which return data rules
			*
			*pattern.matcher(s_name) - in patter value compare with s_name value
			*and return boolean
			*
			*matche.matches() - matches() is method of Matcher class
			*return boolean value
			*/
			Pattern pattern = Pattern.compile(name);
			Matcher matcher = pattern.matcher(s_name);
			System.out.println("Valid Name :" + matcher.matches());

			if(matcher.matches())
			System.out.println("Data is valid.");
			else
			System.out.println("Data not Valid");


	}


}