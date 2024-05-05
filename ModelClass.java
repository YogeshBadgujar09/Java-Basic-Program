class ModelClass{

	String firstName;
	String lastName ;
	String number ;

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setNumber(String number)
	{
		this.number = number ;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getNumber()
	{
		return number;
	}

	@Override
	public String toString()
	{

		return "ModelClass{"+ "First Name :'" + firstName + '\'' +   " Last Name :'" + lastName + '\'' + " Number :'" + number + '\'' +  " }";

	}



}