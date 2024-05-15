import java.util.Scanner ;
import java.util.ArrayList;

class StudentInfoMain{

	Scanner scanner = new Scanner(System.in);


	ArrayList <StudentData> multiStudentData  = new ArrayList<>();

	public void operationStudentInfo()
	{

		int choice ;

		do{

			System.out.println("\n1.Insert Information \n2.Show Information \n3.Find Student");
			System.out.println("\nEnter Your Choice :");
			choice = scanner.nextInt();

			switch(choice)
			{
				case 1 :
				setInformation();
				break;

				case 2:
				getInformation();
				break ;

				case 3 :
				findStudentInfo();
				break;

			}


		}while(choice < 4);


	}


	public void setInformation()
	{
		StudentData studentData = new StudentData();

		System.out.println("\nEnter Roll No :");
		studentData.set_rollNo(scanner.next());


		System.out.println("Enter Name :");
		studentData.set_name(scanner.next());


		System.out.println("Enter Address :");
		studentData.set_address(scanner.next());

		multiStudentData.add(studentData);

	}

	public void getInformation()
	{
		if(multiStudentData != null)
		{
			for(int i=0 ; i<multiStudentData.size() ; i++)
			{
				StudentData studentData = multiStudentData.get(i);

				System.out.println(studentData.toString());
			}


		}
		else{

			System.out.println("Data List is Empty");
		}

	}


	public void findStudentInfo()
	{
		System.out.println("Enter name to Show Information ");
		String name = scanner.next();

		boolean flag = false ;

		if(multiStudentData != null)
		{

				for(int i=0 ; i<multiStudentData.size() ; i++)
				{
					StudentData studentData = multiStudentData.get(i);

					if(name.equals(studentData.get_name()))
					{
						flag = true  ;
						System.out.println(studentData.toString());
					}

				}

				if(!flag)
				{
					System.out.println("Data Not found of Given Name");
				}

		}




	}




	public static void main(String args[])
	{
		StudentInfoMain studentInfoMain = new StudentInfoMain();
		studentInfoMain.operationStudentInfo();

	}

}