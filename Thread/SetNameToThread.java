class SetNameToThread
{

	public static void main(String args[])
	{
		Thread thread = Thread.currentThread();
		System.out.println("currentThread :" + thread);

		thread.setName("MyThreadName");
		System.out.println("currentThread :" + thread);
		
	}

}