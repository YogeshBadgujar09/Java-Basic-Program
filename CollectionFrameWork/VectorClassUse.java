import java.util.Scanner;
import java.util.Vector;

class VectorClassUse
{
	 String id ;
	 String name ;
	 String department ;

	Scanner sc = new Scanner(System.in);

	public void operation()
	{
		int choice ;

		System.out.pintln("1.Add Info \n2.See Info");

		do
		{
			System.out.println("Enter Choice :");
			choice  =  sc.nextInt();

			switch(choice)
			{
				case 1 :
				setInfo();
				break ;

				case 2 :
				toString();
				break ;
			}

		}
		while(choice < 3);

	}

	 public void setInfo()
	 {
		System.out.println("Enter Id :");
		id =  sc.next();

		System.out.println("Enter name :");
		name =  sc.next();

		System.out.println("Enter Department :");
		department =  sc.next();
	  }

	 @Override
	 public String toString()
	 {
 		 return "StudentInfo{ id : " + id + " name : " + name + " department : " + department + " }";
	 }

	public static void main(String args[])
	{
		//		Scanner sc = new Scanner(System.in);

		VectorClassUse  obj = new VectorClassUse();
		obj.setInfo("1","Nayan","Computer") ;
		System.out.println(obj.toString());



	}

}