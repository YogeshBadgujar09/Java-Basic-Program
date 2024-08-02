import java.util.Scanner;

/**
 * Apna Collage
 * Take task for find X number in 2D Array
 */
public class Task6AC {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] numbersMatix = new int[row][col];

        System.out.println("\nEnter Numbers :");
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0; j<col ; j++)
            {
                numbersMatix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter a number for searching :");
        int find = scanner.nextInt();

        
        boolean flag = false ;
        for(int i=0 ; i<row ; i++)
        {
            for(int j=0; j<col ; j++)
            {
                if(numbersMatix[i][j] == find)
                {
                    flag = true;
                    System.out.println(find + "is on " + "numbersMatrix" + "[" + i + "]" + "[" + j +"]" + "Position");
                
                }
            }
        }

        if(!flag)
        {
            System.out.println("Number not Available");
        }

    }
    
}
