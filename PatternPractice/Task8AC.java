public class Task8AC {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Before swap: x = " + x + ", y = " + y);
        
        // Swap x and y using bitwise XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        
        System.out.println("After swap: x = " + x + ", y = " + y);
    }
}
