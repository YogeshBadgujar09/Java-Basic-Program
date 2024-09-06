class ThreadDemo
{

	public static void main(String[] args)
	{

		Thread thread = Thread.currentThread();
		
		System.out.println("Current Thread :" + thread);

		thread.setName("MyThread");

		System.out.println("Thread Name change :" + thread);

		try{
			for(int i=5; i>0 ; i--)		
			{
				System.out.println(i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interrupted");
		}
		
	
	}


}