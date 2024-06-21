import java.util.ArrayList ;
import java.util.Iterator ;

class IteratorInterface {

	public static void main(String args[])
	{
		Integer a ;

		ArrayList <Integer> age = new ArrayList<>() ;
		age.add(28);
		age.add(11);
		age.add(40);
		age.add(45);

		ArrayList <String> name = new ArrayList() ;
		name.add("Nayan");
		name.add("Gagan");
		name.add("Raman");
		name.add("Naman");


		/*
		for(int i=0 ; i<age.size() ; i++)
		{
			System.out.println(age.get(i));
		}
		*/

		Iterator iterator = age.iterator();


		while(iterator.hasNext())
		{
			System.out.println(iterator.next());

		}

		iterator = name.iterator();
		while(iterator.hasNext())
		{
					System.out.println(iterator.next());

		}



 }

}