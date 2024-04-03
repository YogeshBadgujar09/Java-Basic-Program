import java.util.Scanner ;

class EmployeeInfo{

	String id ;
	String name ;
	String salary ;

	public void setEmployeeInfo()
	{

		Scanner sc = new Scanner(System.in);

		System.out.print("\nEnter Id Number :");
		this.id = sc.next();

		System.out.print("Enter Name :");
		this.name = sc.next();

		System.out.print("Enter Salary :");
		this.salary = sc.next();

		 getEmployeeInfo();


	}

	public void getEmployeeInfo()
	{
		System.out.print("\n\nEmployee Information :");

		System.out.println(this.id + " " + this.name + " " + this.salary);
	}

}

class EmployeeDepartment extends EmployeeInfo{

	String department ;
	String work_Position ;

	public void setDepartment(String department , String work_Position)
	{
		this.department = department ;
		this.work_Position = work_Position ;

		System.out.println("Join IN Department \n");
		getDepartment();

		super.setEmployeeInfo();



	}

	public void getDepartment()
	{
		System.out.print("Department :" + this.department + "\nWorking Position :" + this.work_Position + "\n" ) ;
	}

}


class SingleInheritanceEmp{

	public static void main(String args[])
	{

		EmployeeDepartment obj = new EmployeeDepartment();
		obj.setDepartment("Computer", "Head of Department");

	}

}