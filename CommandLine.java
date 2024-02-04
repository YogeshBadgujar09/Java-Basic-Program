class CommandLine{

		public static void main(String args[])
		{
			int count;

			int i=0;			

			String str;

			count=args.length;

			System.out.println("No Of Argument You Entered :"+count);

			
 			while(i<count)
			{
				str=args[i];

				System.out.println(i+" :"+"Java is "+str+"!");	

				i=i+1;
			
				
			}

		
		}

}