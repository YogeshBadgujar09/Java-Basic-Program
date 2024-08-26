import java.util.Random;

class SelectStrRandom{

	public static void main(String args[])
	{
		String str[] = {"Yogesh" , "Rohit" , "Rahul" , "Dipak"};

		Random random = new Random();

		String randomStr = str[random.nextInt(str.length)];

		System.out.println("Random Name :" + randomStr2);

	}

}