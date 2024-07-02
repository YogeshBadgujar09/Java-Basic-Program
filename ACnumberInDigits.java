import java.util.Random;

public class ACnumberInDigits {
    public static void main(String[] args) {
        Random rand = new Random();
        long accountNumber = rand.nextLong();
        System.out.println("Account Number: " + Math.abs(accountNumber));
    }
}


