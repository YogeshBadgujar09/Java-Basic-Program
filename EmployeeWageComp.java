import java.util.Random;

public class EmployeeWageComp {

	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");

		int attendance ;
		int dailyWage ;
		int employee_Type ;
		final int WAGE_PER_HR = 20;
		final int PART_TIME_HR = 4;
		final int FULL_TIME_HR = 8;

		Random random = new Random();
	    attendance = random.nextInt(9)%2;

		System.out.println(attendance);


		switch(attendance)
		{
			case 0 :
			System.out.println("Employee is Absend");
			break;

			case 1 :
			System.out.println("Employee is Present");

			employee_Type = random.nextInt(9)%2;

					switch(employee_Type)
					{
						case 0 :
						System.out.println("Employee is Part Time");
						dailyWage = PART_TIME_HR * WAGE_PER_HR ;
						System.out.println("Employee Wage is :" + dailyWage );
						break;

						case 1 :
						System.out.println("Employee is Full Time");
						dailyWage = FULL_TIME_HR * WAGE_PER_HR ;
						System.out.println("Employee Wage is :" + dailyWage );
						break;

						default:
						System.out.println("Case isn't match");
					}

			break;

			default:
			System.out.println("Case isn't match");


		}

	}

}
