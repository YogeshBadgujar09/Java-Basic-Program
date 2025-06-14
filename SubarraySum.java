import java.util.*;

public class SubarraySum {
    public static List<Integer> findSubarrayWithSum(int[] arr, int target) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                // Return 1-based indices
                return Arrays.asList(start + 1, end + 1);
            }
        }

        return Arrays.asList(-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        List<Integer> result = findSubarrayWithSum(arr, target);
        System.out.println(result);  // Output: [2, 4]
    }
}
