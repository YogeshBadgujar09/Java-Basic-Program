declare 
	i number;
begin
	i:=1;
	while i<5 loop
		dbms_output.put_line(i);
		i:=i+1;
	end loop;
end;
/