abstract class SampleDemo{

	abstract void add(int a,int b);
	abstract void sub(int a,int b);
}

class AbstractmethodDemo extends SampleDemo{

	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition="+c);
	}

	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("Addition="+c);
	}

	public static void main(String args[]){
		int a=10;
		int b=20;
		AbstractmethodDemo obj = new AbstractmethodDemo();
		obj.add(a,b);
		obj.sub(a,b);
	}
}