import java.util.Scanner;

class ScannerProblemFacing
{
	public static void main(String[]  args){
		
		Scanner scanner = new Scanner(System.in);		

		int choice ;

		do{
			System.out.println("Enter Choice :");
			choice = scanner.nextInt();

			if(choice == 1){
				System.out.println("Hello");			
			}else if(choice == 2){
				System.out.println("Hello Hello");			
			}else{
				System.out.println("Bye");			
			}

		}while(choice < 3)	;

	}
}