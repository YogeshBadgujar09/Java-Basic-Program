import java.util.UUID;

public class AccountNumberGenerator
{

	 public static void main(String[] args) {

	  String accountNumber = generateAccountNumber();
	  System.out.println("Generated Account Number: " + accountNumber);
 }

	 private static String generateAccountNumber() {
	 
	  return "ACC" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
 	}
}