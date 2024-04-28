import java.util.Scanner;

class AddressBookMain
{

	ContactsModul contactsModul = new ContactsModul();

	AddressBookMain()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First Name :");
		contactsModul.set_first_Name(sc.next());
	
		System.out.print("Enter Last Name :");
		contactsModul.set_last_Name(sc.next());

		System.out.print("Enter Address :");
		contactsModul.set_address(sc.next());

		System.out.print("Enter city :");
		contactsModul.set_city(sc.next());

		System.out.print("Enter State :");
		contactsModul.set_state(sc.next());

		System.out.print("Enter Zip Code :");
		contactsModul.set_zip_Code(sc.next());

		System.out.print("Enter Phone Number :");
		contactsModul.set_phone_Number(sc.next());
		
		System.out.print("Enter Email :");
		contactsModul.set_email_Id(sc.next());

	}

	public static void main(String args[])
	{
		System.out.println("Welcome To Address Book");
		
		AddressBookMain addressBookMain = new AddressBookMain();
	}

}