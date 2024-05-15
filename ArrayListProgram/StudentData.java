class StudentData{

	private String rollNo ;
	private String name;
	private String address  ;


	public void set_rollNo(String rollNo)
	{
		this.rollNo = rollNo ;
	}

	public void set_name(String name)
	{
		this.name = name ;
	}

	public void set_address(String address)
	{
		this.address = 	address ;
	}

	public String get_rollNo()
	{
		return rollNo ;
	}

	public String get_name()
	{
		return name ;
	}

	public String get_address()
	{
		return address ;
	}


	@Override

	public String toString()
	{

		return "StudentData {" +
				" Roll No : '" + rollNo + '\'' +
				" Name : '"  + name + '\'' +
				" Address : '" + address + '\'' + "}"  ;


	}


}