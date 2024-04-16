import java.util.Scanner;
import ResultPack.Result;

class StudentInfo{

	int id;
	String name;

	public void setStudentInfo()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id and Name :");
		id = sc.nextInt();
		name = sc.next();
	}

	public static void main(String args[])
	{
		StudentInfo studentInfo = new StudentInfo();
		Result result = new Result();

		studentInfo.setStudentInfo();
		result.setPercentage();
	}

}