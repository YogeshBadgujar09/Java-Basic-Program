public class Task7AC {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        // Swap x and y without using a temporary variable
        x = x + y; // x now becomes 15
        y = x - y; // y becomes 5
        x = x - y; // x becomes 10
        
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
