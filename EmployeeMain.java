package com.yogesh.employee;

public class EmployeeMain {

	int employeeId ;
	String employeeName;
	String employeeMobileNo;
	double employeeSalary;
	
	public void setEmployeeData(int employeeId , String employeeName , String employeeMobileNo , double employeeSalary)
	{
		this.employeeId = employeeId ;
		this.employeeName = employeeName ;
		this.employeeMobileNo = employeeMobileNo ;
		this.employeeSalary = employeeSalary ;		
	}
	
	public void getEmployeeData()
	{
		System.out.println("E_Id :" + this.employeeId +"\nE_Name :" + this.employeeName + "\nE_MobileNo :" + this.employeeMobileNo + "\nE_Salary :" + this.employeeSalary);
		
	}
	
	public static void main(String[] args) {
		
	EmployeeMain employeemain = new EmployeeMain();
	employeemain.setEmployeeData(101, "Yogesh", "1234567890", 10000);
	employeemain.getEmployeeData();

	}

}
