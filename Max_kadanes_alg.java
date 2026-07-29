import java.util.*;

public class Max_kadanes_alg {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner sc = new Scanner(System.in);

        // Read the number of elements
        int n = sc.nextInt();

        // Read input array values
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize current sum and maximum sum using the first element
        int currsum = arr[0];
        int maxsum = arr[0];

        // Iterate through the array, applying Kadane's algorithm
        for (int i = 1; i < n; i++) {
            // Either extend the existing subarray or start a new one at arr[i]
            currsum = Math.max(arr[i], currsum + arr[i]);
            // Update maxsum if the current subarray sum is greater
            maxsum = Math.max(currsum, maxsum);
        }

        // Output the maximum subarray sum
        System.out.print(maxsum);
        sc.close();
    }
}