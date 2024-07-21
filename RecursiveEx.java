class RecursiveEx{
    
    public static void main(String[] args) {
    
        int result = factorial(5);
        System.out.println("Factorial of 5: " + result);
    }

    
    public static int factorial(int n) {
         
         
        if (n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }
}
