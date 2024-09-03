declare 
	i number;
begin
	i:=1;
	loop
		exit when i>5;
		dbms_output.put_line(i);
		i:=i+1;
	end loop;
end;
/