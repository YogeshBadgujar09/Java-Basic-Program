public class StringFunction{
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s.substring(s.length() - 1)); // prints "o"
        
        // Try to print the first character of the string
        System.out.println(s.substring(0, 0)); // prints nothing!
        
        // Try to print the entire string
        System.out.println(s.substring(0, s.length())); // prints "Hello"
        
        // Try to print the string from the 5th character to the end
        System.out.println(s.substring(5)); // prints nothing!
        
        // Try to print the string from the 10th character to the end
        System.out.println(s.substring(10)); // throws StringIndexOutOfBoundsException!
    }
}
