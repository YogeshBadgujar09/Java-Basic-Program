import java.util.Vector;
import java.util.Scanner ;

class VectorExample{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<String> stringList = new Vector<>();
		int choice ;

		do{

				System.out.println("**** Manage String ****");
				System.out.println("1.Size \n2.Add String  \n3.Show all data  \n4.Insert String at Point \n5.Delete String \n6.Check Available");

				System.out.print("Enter Your Choice :");
				choice = sc.nextInt();

				switch(choice)
				{
					case 1 :
					System.out.println("Size of list : "  + stringList.size());
					break ;

					case 2 :
					System.out.println("Enter String to add : ");
					stringList.addElement(sc.next());
					break ;

					case 3 :
					System.out.println("Value of List :" + stringList);
					break ;

					case 4 :
					System.out.println("Insert String and Index Number : " );
					stringList.insertElementAt(sc.next(),sc.nextInt()) ;
					break ;

					case 5 :
					System.out.println("Enter String to Delete :");
					stringList.removeElement(sc.next());
					break ;

					case 6 :
					System.out.println("Check String is available or not " );
					System.out.println(stringList.contains(sc.next()));

					break ;

				}


		}while(choice < 7);

	}

}