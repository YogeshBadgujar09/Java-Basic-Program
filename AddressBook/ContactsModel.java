class ContactsModel{

	private String  first_Name ;
	private String last_Name ;
	private String address ;
	private String city ;
	private String state ;
	private String zip_Code ;
	private String phone_Number ;
	private String email_Id ;

	public void set_first_Name(String first_Name)
	{
		this.first_Name = first_Name ;
	}

	public void set_last_Name(String last_Name)
	{
		this.last_Name = last_Name ;
	}

	public void set_address(String address)
	{
		this.address = address ;
	}

	public void set_city(String city)
	{
		this.city =  city ;
	}

	public void set_state(String state)
	{
		this.state = state ;
	}

	public void set_zip_Code(String zip_Code)
	{
		this.zip_Code = zip_Code ;
	}

	public void set_phone_Number(String phone_Number)
	{
		this.phone_Number = phone_Number ;
	}

	public void set_email_Id(String email_Id)
	{
		this.email_Id = email_Id ;
	}

	public String get_first_Name()
	{
		return this.first_Name ;
	}

	public String get_last_Name()
	{
		return this.last_Name ;
	}

	public String get_address()
	{
		return this.address;
	}

	public String get_city()
	{
		return this.city ;
	}

	public String get_state()
	{
		return this.state ;
	}

	public String get_zip_Code()
	{
		return this.zip_Code;
	}

	public String get_phone_Number()
	{
		return this.phone_Number ;
	}

	public String get_email_Id()
	{
		return this.email_Id ;
	}


	@Override

	public String toString()
	{

		return "ContactsModel{" +

		"First Name :'" + first_Name + '\'' +
		", Last Name : '" + last_Name + '\'' +
		", Address :'" + address + '\'' +
		", City :'" + city + '\'' +
		", State :'" + state + '\'' +
		", ZipCode :'" + zip_Code + '\'' +
		", Phone Number :'" + phone_Number + '\'' +
		", Email :'" + email_Id + '\''+"}" ;

	}



}