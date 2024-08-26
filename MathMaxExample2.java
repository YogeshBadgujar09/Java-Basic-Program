public class MathMaxExample2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximum of " + num1 + ", " + num2 + ", and " + num3 + " is " + max);
    }
}
