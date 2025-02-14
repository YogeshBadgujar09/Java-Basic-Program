import java.util.Scanner;

class TCSquestion2{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :"); 
        int n = scanner.nextInt();

        int []arr = new int[n];

        System.out.println("Enter Array Element :");
        for(int i = 0; i < arr.length ; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println("Elements you entered ... !!!");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        
        int[] firstProduction = new int[arr.length / 2];
        int[] secondProduction = new int[arr.length / 2];

        for(int i = 0; i < firstProduction.length ; i++){
            firstProduction[i] = arr[i];
        }

        int k = arr.length / 2;

        for(int i = 0; i < secondProduction.length; i++){
            secondProduction[i] = arr[k];
            k++;
        }
        
        int a = 0;
        int b = 0;

        for(int i = 0 ; i < firstProduction.length - 1 ; i++) {
            a = firstProduction[i] * firstProduction[i + 1];
            b = secondProduction[i] * secondProduction[i + 1];
        }
        
        if(a < b)
        {
            for(int i = arr.length - 1 ; i >=  0 ; i--){
                System.out.print(arr[i] + " ");
            }
        }

    }
}