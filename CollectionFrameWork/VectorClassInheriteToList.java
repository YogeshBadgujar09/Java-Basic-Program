import java.util.List;
import java.util.Vector;

class  VectorClassInheriteToList{

	public static void main(String args[])
	{
		List<String> name  = new Vector<>();
		name.add("yogesh");
		name.add("rohit");
		name.add("Shubham");
		name.add("Jayesh");
		name.add("Dipak");

		/**
		*for loop is use for show data.
		*/
		for(int i=0 ; i<name.size() ; i++)
		{
			System.out.println(name.get(i));
		}

		System.out.println();

		/**
		*Using remove() function the object of Current class will be delete
		*/
		name.remove("Dipak");


		/**
		* instance for loop or Advance for loop
		*Work as following loop
		*/

		//for(int i = 0; i < name.size(); i++ ) {
		//     String str = name.get(i);
		//     System.out.println(str);
		// }

		for(String str : name)
		{
			System.out.println(str);
		}




	}

}