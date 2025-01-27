import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import java.util.Scanner;
import java.util.Random;

public class SendOTPSample2 {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        // Your Account SID from (link unavailable)
        String accountSID = "AC2b8e564c86d1ca13f30ec80d4c065306";
        // Your Auth Token from (link unavailable)
        String authToken = "7f1eecfd1572b5627cfa96b8c0f83e62";
        Twilio.init(accountSID, authToken);

        // Generate OTP
        String otp = generateOtp();

        // Send OTP
        Message message = Message.creator(
                        new PhoneNumber("+919770300812"), // To number
                        new PhoneNumber("+12765313913"), // From number
                        "Your OTP is: " + otp)
                .create();

        System.out.println("OTP sent successfully!");

	System.out.println("\n\nEnter OTP :");
	String otpVerify = scanner.next();

	if(otp.equals(otpVerify))
	{
		System.out.println("Successfull match");
	}	
	else{
		System.out.println("not match");
	}
    }

    private static String generateOtp() {
        // 6-digit random OTP
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }
        return otp.toString();
    }
}