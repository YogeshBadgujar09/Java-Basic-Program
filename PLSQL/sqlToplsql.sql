declare
	salary employeeinfo.esalary%TYPE;
begin
	select esalary into salary from employeeinfo where eid=1;
	
	dbms_output.put_line('Salary of eid 1 :' || salary);
end;
/