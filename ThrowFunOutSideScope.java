
import java.util.Scanner;

class ThrowFunOutSideScope
{

	int a ;

	void setA(int a)
	{
		this.a = a; 
	}
	
	int getA()
	{
	 	return this.a ;
	}	
	
	static void check(ThrowFunOutSideScope x , ThrowFunOutSideScope y)
	{
		if(x.a == y.a){
			System.out.println("X is equal to Y");
		}else if(x.a > y.a){
			System.out.println("X is greater than Y");
		}
		else{
			System.out.println("X is less than  Y");
		}
	
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ThrowFunOutSideScope x = new ThrowFunOutSideScope();
		x.setA(sc.nextInt());
		x.getA();
	
		ThrowFunOutSideScope y = new ThrowFunOutSideScope();				 
		y.setA(sc.nextInt());
		y.getA();

		check(x,y);
	
	}




}