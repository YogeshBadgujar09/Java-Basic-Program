import java.util.Map;
import java.util.HashMap ;
class HashMapInheritToMap
{

	public static void main(String[] args)
	{

		Map<String,String > stateCapital = new HashMap<>();

		stateCapital.put("MP","Bhopal");
		stateCapital.put("MH","Mumbai");
		stateCapital.put("AP","Hydrabad");
		stateCapital.put("PJ","Chandighar");

		/**
		*keySet() function display the all keys of object(stateCapital) ,
		*but that is in set form
		*/
		System.out.println("Key : " + stateCapital.keySet() + "\n");

		/**
		*values() function display all the values of keys ,
		*but in the form of set.
		*/
		System.out.println("value : " + stateCapital.values() + "\n");


		/**
		*Instance for loop in Java , optimize the code .
		*get the copy of stateCapital and automatically iterate to the size of stateCapital
		*Here , key is instance of String class which assign the keys of stateCapital object
		*get() bring the value of current key.
		*
		*/
		for(String key : stateCapital.keySet())
		{
			System.out.println("Key : " + key  + "\t" + stateCapital.get(key));
		}

		/**
		*containsKey() function  check the key is available in Object or not.
		*containKey() is return boolean value true or false
		*containKey() is case sensetive
		*/
		System.out.println("\nIs in Map current key is present : " + stateCapital.containsKey("MP"));



		/**
		*containsValue() function  check the value is available in Object or not.
		*containsValue() is return boolean value true or false
		*containsValue() is case sensetive
		*/

		System.out.println("\nIs in Map current value is present : " + stateCapital.containsValue("Mumbai"));



	}

}