import java.util.Scanner;
class CheckElement1{

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a value: ");
	        String input = scanner.next();

	        if (input.matches("\\d+")) {
	            System.out.println("Input is an integer");
	        } else if (input.matches("[a-zA-Z]")) {
	            System.out.println("Input is a character");
	        } else {
	            System.out.println("Input is a symbol");
	        }
	    }



}