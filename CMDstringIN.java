class CMDstringIN{

	public static void main(String args[])
	{
		int count;

		count=args.length;

		System.out.println("No of Arguments are :"+count);

		for(int i=0 ;i<args.length ;i++)
		{
			
			System.out.println(args[i]);
		}
	}

}