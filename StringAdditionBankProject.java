
import java.util.Scanner ;
public class StringAdditionBankProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Balance = "10000";
        System.out.println("Enter a amount to Deposit :");
        String depositAmmount = scanner.next();

        long lBalance = Long.parseLong(Balance);
        long ldepositeAmmount = Long.parseLong(depositAmmount);

        Balance = String.valueOf(lBalance + ldepositeAmmount) ;

        System.out.println("Total Ammount :" + Balance);

    }



}
