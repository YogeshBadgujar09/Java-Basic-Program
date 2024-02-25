package com.yogesh.employee.model;

public class EmployeeModel {
	
	private int employeeId ;
	private String employeeName;
	private String employeeMobileNo;
	private double employeeSalary;
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId ;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName ;
	}
	
	public void setEmployeeMobileNo(String employeeMobileNo)
	{
		this.employeeMobileNo = employeeMobileNo ;
	}
	
	public void setEmployeeSalary(double employeeSalary)
	{
		this.employeeSalary = employeeSalary ;
	}
	
	

	public int getEmployeeId()
	{
		return this.employeeId ;
	}
	
	public String getEmployeeName()
	{
		return this.employeeName ;
	}
	
	public String getEmployeeMobileNo()
	{
		return this.employeeMobileNo ;
	}
	
	public double getEmployeeSalary()
	{
		return this.employeeSalary ;
	}


}
