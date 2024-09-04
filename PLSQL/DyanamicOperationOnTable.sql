accept id prompt 'Enter an id to update Salary :'
declare 
	name employeeinfo.ename%TYPE;
	salary employeeinfo.esalary%TYPE;
	bonus employeeinfo.esalary%TYPE;
	ha employeeinfo.esalary%TYPE;
	id number(4);
	
begin 
	id := &id;
	
	SELECT ename,esalary INTO name,salary FROM employeeinfo WHERE eid=id;

	dbms_output.put_line('Employee Name:' || name);
	dbms_output.put_line('Basic Salary :' || salary);
	
	bonus := salary * 0.10;
	dbms_output.put_line('Bonus:' || bonus);

	ha := salary * 0.15;
	dbms_output.put_line('Home allowance :' || ha);	

	salary := salary + bonus + ha;
	dbms_output.put_line('Updated Salary :' || salary);

	UPDATE employeeinfo SET esalary=salary WHERE eid=id;

	commit;	

end;
/