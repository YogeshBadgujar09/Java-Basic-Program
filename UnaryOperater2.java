public class UnaryOperater2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 5;

        System.out.println(i++ + j++); // Output: 10
        System.out.println(i + j); // Output: 12

        i = 5;
        j = 5;

        System.out.println(++i + ++j); // Output: 12
        System.out.println(i + j); // Output: 12

        i = 5;
        j = 5;

        System.out.println(i++ + ++j); // Output: 11
        System.out.println(i + j); // Output: 12
    }
}
