public class Task1 {

    public static void main(String[] args) {

         for(int i=1 ; i<=5 ; i++)
         {
             
             for(int j=1 ; j<=i ; j++)
             {
                 if(i==j)
                 {
                     System.out.print(i);
                 }
                 else {
                     System.out.print(j);
                 }
             }
             System.out.println();
         }

    }
}
