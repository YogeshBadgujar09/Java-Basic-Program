class AddOfIndex{

		public static void main(String args[])
		{
		 
			int a[]=new int[args.length];
			
			int i=0;

			int add=0;
			
			
			for(i=0 ;i<args.length ;i++)
			{					
				a[i]=Integer.parseInt(args[i]);			

				System.out.println(i+" :"+a[i]);

				add=add+a[i];
			}
			
			System.out.println();				
			System.out.println("Addition of a[] :"+add);								
 		

		}


}