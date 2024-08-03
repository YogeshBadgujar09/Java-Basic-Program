
public class Task10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Print the sum of all elements in the array
        System.out.println(arr[0] + arr[arr.length - 1]); // prints 6
        
        // Try to print the sum of all elements using a loop
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        System.out.println(sum); // prints 10, not 15!
    }
}
