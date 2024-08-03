public class Task9{

	public static void main(String[] args) {
        int x = 10;
        int y = 20;
        
        // Swap x and y using a single line of code
        x = x + y - (y = x);
        
        System.out.println("x = " + x + ", y = " + y);
    }
}
