package com.yogesh.employee;

import java.util.Scanner;

import com.yogesh.employee.model.EmployeeModel;

public class EmployeeMain {

	EmployeeModel employeeModel = new EmployeeModel();
	
	public void setEmployeeData()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee Id :");
		employeeModel.setEmployeeId(scanner.nextInt());
		
		System.out.print("Enter Employee Name :");
		employeeModel.setEmployeeName(scanner.next());
		
		System.out.print("Enter Employee Mobile No :");
		employeeModel.setEmployeeMobileNo(scanner.next());
		
		System.out.print("Enter Employee Salary :");
		employeeModel.setEmployeeSalary(scanner.nextDouble());
	}
	
	public void getEmployeeData()
	{
		 System.out.println("Employee ID :" + employeeModel.getEmployeeId());
		 System.out.println("Employee Name :" + employeeModel.getEmployeeName());
		 System.out.println("Employee Mobile No :" + employeeModel.getEmployeeMobileNo());
		 System.out.println("Employee Salary :" + employeeModel.getEmployeeSalary()); 
		
	}
	
	public static void main(String[] args) {
		
	EmployeeMain employeemain = new EmployeeMain();
	employeemain.setEmployeeData();
	employeemain.getEmployeeData();

	}

}
