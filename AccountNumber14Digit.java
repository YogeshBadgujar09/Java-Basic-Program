import java.util.Random;

public class AccountNumber14Digit {

    public static void main(String[] args) {
	
	Random rand = new Random();
        
        long accountNumber = rand.nextLong();
        String accountNumberStr = String.valueOf(Math.abs(accountNumber));
        
        while (accountNumberStr.length() < 14) {
            accountNumberStr += "0";

        }
	
	System.out.println("Account Number: " + accountNumberStr);
    
    }
}
