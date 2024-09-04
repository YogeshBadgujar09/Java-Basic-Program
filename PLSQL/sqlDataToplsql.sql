declare 
	name employeeinfo.ename%TYPE;
	salary employeeinfo.esalary%TYPE;
begin 
	select ename,esalary into name,salary from employeeinfo where eid=3;	
	
	dbms_output.put_line('Name :' || name || ' Salary :' || salary);
end;
/