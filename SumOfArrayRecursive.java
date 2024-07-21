public class SumOfArrayRecursive{

    public static void main(String[] args) {
 
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of array elements: " + sumArray(array, array.length - 1));
    }

    // Recursive function to calculate sum of array elements
    public static int sumArray(int[] array, int index) {
        // Base case: if index is 0, return the first element
        if (index == 0) {
            return array[0];
        }
        // Recursive case: add current element to sum of rest of array
        else {
            return array[index] + sumArray(array, index - 1);
        }
    }
}
