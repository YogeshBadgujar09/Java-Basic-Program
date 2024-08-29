declare
	a number;
	b number;
	c number;
begin
	a:=&a;
	b:=&b;
	c:=a+b;
	dbms_output.put_line('Addition='||c);

	c:=a-b;
	dbms_output.put_line('Substraction='||c);

	c:=a*b;
	dbms_output.put_line('Multiplication='||c);

	c:=a/b;
	dbms_output.put_line('Divide='||c);
end;
/