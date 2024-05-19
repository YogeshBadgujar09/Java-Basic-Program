import java.util.Scanner;
import java.util.ArrayList;

class AddressBookMain
{

	Scanner sc = new Scanner(System.in);

	ArrayList<ContactsModel> contactsList = new ArrayList<ContactsModel>();

	public void contactsOperation()
	{

		int choice ;

		do{

			System.out.println("\n1.Add Contact \n2.Edit Contact \n3.Show Contact \n4.Delete Contact \n5.EXIT");
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
				System.out.println("EXIT");
			}

 		 }while(choice < 5);

	}


	public void addContacts()
	{

		ContactsModel contactsModel = new ContactsModel();

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

		contactsList.add(contactsModel);

	}


 	public void showContacts()
	{
		if(contactsList.isEmpty() == false)
		{

			for(int i=0 ; i<contactsList.size() ; i++)
			{
						ContactsModel contactsModel = contactsList.get(i);
						System.out.println(contactsModel.toString());
			}

		}
		else
		{
				System.out.println("Contacts are not available in Address Book");
		}



	}

	public ContactsModel checkContactExits()
	{
		if(contactsList.isEmpty() == false)
		{
				System.out.println("Enter First Name to Delete Contact :");
				String fname = sc.next();

				boolean flag = false ;

				for(int i=0 ; i<contactsList.size() ; i++ )
				{
					ContactsModel contactsModel = contactsList.get(i);

					if(fname.equals(contactsModel.get_first_Name()))
					{
							flag = true ;
							return contactsModel;
					}

				}

				if(!flag)
				{
					System.out.println("Contact not Found.");

				}
			return null;
		}
		else
		{
			System.out.println("Contact List is Empty.");
			return null;
		}

	}




	public void editContacts()
	{
			 	ContactsModel contactsModel = checkContactExits() ;


				if(contactsModel != null)
				{

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
	}



	public void deleteContacts()
	{
		ContactsModel contactsModel = checkContactExits();

		if(contactsModel != null)
		{
			contactsList.remove(contactsModel);
		}

	}



	public static void main(String args[])
	{
		System.out.println("Welcome To Address Book\n");

		AddressBookMain addressBookMain1 = new AddressBookMain();
		addressBookMain1.contactsOperation();

	}

}