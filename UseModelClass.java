import java.util.Scanner;

class UseModelClass	
{
	//Model Class use here for Data Abstraction 
		
	ModelClass modelClass = new ModelClass();
	Scanner scanner = new Scanner(System.in);
	
	public void GiveData()
	{
		System.out.println("Enter Your First Name :");
		modelClass.setFirstName(scanner.next());	

		System.out.println("Enter Last Name :");
		modelClass.setLastName(scanner.next());

		System.out.println("Enter Number :");
		modelClass.setNumber(scanner.next());
	}

	public void TakeData()
	{
		System.out.println(modelClass.getFirstName());
		System.out.println(modelClass.getLastName());
		System.out.println(modelClass.getNumber());
	
	}

	

	public static void main(String[] args)
	{
		UseModelClass useModelClass = new UseModelClass();
		useModelClass.GiveData();
		useModelClass.TakeData();	
	
	}




}