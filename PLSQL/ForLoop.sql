declare
	i number;
begin
	i:=1;

	for i in 1..5 loop
		dbms_output.put_line(i);
	end loop;
	
end;
/