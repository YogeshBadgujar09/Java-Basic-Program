
//Here's a simple example of how to send an email using Java:


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendEmail {
    public static void main(String[] args) {
        // Email credentials
        String senderEmail = "bankmanagement0918@gmail.com";
        String senderPassword = "BankManagement@1234";

        // Email recipient
        String recipientEmail = "yogeshsb18@gmail.com";

        // Email subject and body
        String subject = "Test Email";
        String body = "Hello, this is a test email.";

        // Send email
        sendEmail(senderEmail, senderPassword, recipientEmail, subject, body);
    }

    public static void sendEmail(String senderEmail, String senderPassword, String recipientEmail, String subject, String body) {
        // Create a Properties object
        Properties props = new Properties();

        // Set email server properties
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Create a Session object
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            // Create a MimeMessage object
            MimeMessage message = new MimeMessage(session);

            // Set the sender email address
            message.setFrom(new InternetAddress(senderEmail));

            // Set the recipient email address
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));

            // Set the email subject
            message.setSubject(subject);

            // Set the email body
            message.setText(body);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");
        } catch (MessagingException e) {
            System.out.println("Error sending email: " + e.getMessage());
        }
    }
}

//
//This code uses the JavaMail API to send an email. You'll need to replace the senderEmail and senderPassword variables with your own email credentials. Also, make sure to enable "Less secure app access" in your email account settings to allow Java to access your email account.
//
//Note: This is a basic example and doesn't include error handling or security measures. You should consider using a more secure approach, such as OAuth, to authenticate with your email account.