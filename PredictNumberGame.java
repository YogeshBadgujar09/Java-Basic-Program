import java.util.Scanner ;
import java.util.Random;

class PredictNumberGame{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int player1 ;
		int player2 ;
		int prediction_Number ;
		int count1 = 0 ;
		int count2 = 0 ;


		do {

					System.out.print("Player 1 Number (0-9 ) : ");
					player1 = scanner.nextInt();


					System.out.print("Player 2 Number (0-9 ) : ");
					player2 = scanner.nextInt();

					prediction_Number = random.nextInt(9);
					System.out.println("Computer generated Number :" + prediction_Number);

					if(player1 == prediction_Number)
					{
						System.out.println("\nPlayer 1 Prediction is Right\n\n");
						count1++ ;
					}
					else if(player2 == prediction_Number)
				 	{
						System.out.println("\nPlayer 2 Prediction is Right\n\n");
						count2++ ;
					}
					else
					{
						System.out.println("\nBoth prediction are wrong\n\n");
					}


		}while(count1 < 11 || count2 < 11) ;

		if(count1 > count2)
		System.out.println("Player 1 is Winner ");
		else
		System.out.println("Player 2 is Winner ");

	}


}