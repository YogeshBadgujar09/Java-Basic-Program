import java.util.Scanner;

class ToStringFunction
{
	ModelClass modelClass = new ModelClass();
	Scanner sc = new Scanner(System.in);

	public void setInfo()
	{
		System.out.println("Enter First Name");
		modelClass.setFirstName(sc.next());

		System.out.println("Enter Last Name");
		modelClass.setLastName(sc.next());

		System.out.println("Enter Number");
		modelClass.setNumber(sc.next());
	}

	public void getInfo()
	{
			System.out.println("\n" + modelClass.toString());
	}


	public static void main(String args[])
	{
		ToStringFunction toStringFunction = new ToStringFunction();
		toStringFunction.setInfo();
		toStringFunction.getInfo();

	}




}