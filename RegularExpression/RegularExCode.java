import java.util.regex.Pattern ;
import java.util.regex.Matcher ;

class RegularExCode
{

	private String rollNo;
	private String name ;
	private String salary ;

	public void setInfo(String rollNo, String name, String salary)
	{
		Pattern pattern = Pattern.compile("^[0-9]{1,6}$");
		Matcher matcher = pattern.matcher(rollNo);

		if(matcher.matches())
		{
			 this.rollNo = rollNo ;
		}
		else{
			System.out.println("Please enter Valid Roll No .");
		}

		pattern = Pattern.compile("^[A-Za-z]{2,}$");
		matcher = pattern.matcher(name);

		if(matcher.matches())
		{
			this.name = name ;
		}
		else{
					System.out.println("Please enter Minimum 3 Character .");
		}


		pattern = Pattern.compile("^[0-9]{4,}$");
		matcher = pattern.matcher(salary);

		if(matcher.matches())
		{
			this.salary = salary ;
		}
		else
		{
			System.out.println("Please enter Valid Salary");
		}

	}

	public void showInfo()
	{
		System.out.println(rollNo + " " + name + " " + salary );
	}
	public static void main(String args[])
	{
		RegularExCode obj = new RegularExCode();
		obj.setInfo("1","Yogesh","10000");
		obj.showInfo();

	}

}