import java.util.Scanner;

class AddressBookMain
{

	ContactsModel contactsModel = new ContactsModel();
	Scanner sc = new Scanner(System.in);

	
	public void contactsOperation()
	{
		while(true)
		{

			int choice ;
		
			System.out.println("\n1.Add Contact \n2.Edit Contact \n3.Show Contact \n4.Delete Contact \n5.Exit");
			System.out.println("\nEnter Choice :");
			choice = sc.nextInt();

			switch(choice)
			{
				case 1:
				addContacts();
				break ;
	
				case 2:
				editContacts();
				break ;

				case 3:
				showContacts();
				break ;

				case 4:
				deleteContacts();
				break ;
		
				default :
				System.out.println("Case not Match");
			}	
			
			if(choice == 5)
			{
				System.out.println("\nEXIT");
				break;
			}
		 }
		


	}

	 
		
	public void addContacts()
	{	
		System.out.print("Enter First Name :");
		contactsModel.set_first_Name(sc.next());
	
		System.out.print("Enter Last Name :");
		contactsModel.set_last_Name(sc.next());

		System.out.print("Enter Address :");
		contactsModel.set_address(sc.next());

		System.out.print("Enter city :");
		contactsModel.set_city(sc.next());

		System.out.print("Enter State :");
		contactsModel.set_state(sc.next());

		System.out.print("Enter Zip Code :");
		contactsModel.set_zip_Code(sc.next());

		System.out.print("Enter Phone Number :");
		contactsModel.set_phone_Number(sc.next());
		
		System.out.print("Enter Email :");
		contactsModel.set_email_Id(sc.next());
	
	}

	public void showContacts()
	{
		System.out.println("\nFirst Name :" + contactsModel.get_first_Name());
		System.out.println("Last Name :" + contactsModel.get_last_Name());
		System.out.println("Address :" + contactsModel.get_address());
		System.out.println("City :" + contactsModel.get_city());
		System.out.println("State :" + contactsModel.get_state());
		System.out.println("Zip Code :" + contactsModel.get_zip_Code());
		System.out.println("Phone NUmber :" + contactsModel.get_phone_Number());
		System.out.println("Gmail :" + contactsModel.get_email_Id());

	}

	public void editContacts()
	{

		System.out.println("\nEnter First Name to Edit Contact :");
		String fname = sc.next();

		if(fname.equals(contactsModel.get_first_Name()))
		{
			System.out.println("Contact Found.");
			
			System.out.print("Enter Last Name :");
			contactsModel.set_last_Name(sc.next());

			System.out.print("Enter Address :");
			contactsModel.set_address(sc.next());
	
			System.out.print("Enter city :");
			contactsModel.set_city(sc.next());
	
			System.out.print("Enter State :");
			contactsModel.set_state(sc.next());
	
			System.out.print("Enter Zip Code :");
			contactsModel.set_zip_Code(sc.next());
		
			System.out.print("Enter Phone Number :");
			contactsModel.set_phone_Number(sc.next());
			
			System.out.print("Enter Email :");
			contactsModel.set_email_Id(sc.next());
		}
		else
		{
			System.out.println("Contact not found");
		}

	}
		
	public void deleteContacts()
	{
		System.out.println("\nContact is Delete Succesfully.");
		
		contactsModel.set_first_Name(null);
		contactsModel.set_last_Name(null);
		contactsModel.set_address(null);
		contactsModel.set_city(null);
		contactsModel.set_state(null);
		contactsModel.set_zip_Code(null);
		contactsModel.set_phone_Number(null);
		contactsModel.set_email_Id(null);
	}
	
	 	

	public static void main(String args[])
	{
		System.out.println("Welcome To Address Book\n");
		
		AddressBookMain addressBookMain = new AddressBookMain();
		addressBookMain.contactsOperation();
		
	 
	}

}