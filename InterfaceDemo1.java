interface InterfaceSample
{
	public int a = 10;
	void demoFun1();
	void demoFun2();
}
class Sample implements InterfaceSample{
	
	public void demoFun1()
	{
		System.out.println("Function 1");
	}

	public void demoFun2()
	{
		System.out.println("Function 2");
	}

}

class InterfaceDemo1
{
	public static void main(String args[])
	{
		Sample sample = new Sample();
		System.out.println("A =" + sample.a);
		sample.demoFun1();
		sample.demoFun2();
	}

}