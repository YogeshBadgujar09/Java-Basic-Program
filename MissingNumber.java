public class MissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;  // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missing = findMissingNumber(arr);
        System.out.println("Missing number is: " + missing);  // Output: 4
    }
}
