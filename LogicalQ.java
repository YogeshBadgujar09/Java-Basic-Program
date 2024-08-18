public class LogicalQ{
    public static void main(String[] args) {
        int i = 5;
        for (; i < 10; ) {
            System.out.println(i); // Output: 5, 6, 7, 8, 9
            i++;
        }
        System.out.println(i); // Output: 10

        i = 10;
        for (; i > 5; ) {
            System.out.println(i); // Output: 10, 9, 8, 7, 6
            i--;
        }
        System.out.println(i); // Output: 5
    }
}