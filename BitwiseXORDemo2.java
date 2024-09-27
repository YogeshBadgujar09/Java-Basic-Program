public class BitwiseXORDemo2 {
    public static void main(String[] args) {
        
	int num = 10;  // 1010 in binary
	int mask = 2;  // 0010 in binary

	num ^= mask;  // toggle the second bit

	System.out.println("The result is: " + num);
    }
}

