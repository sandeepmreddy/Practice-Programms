package Arrays.Greedy;
//Time Complexity: O(n),Space Complexity: O(1)
public class MaxSubarraySumBest1 {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArray(int[] nums) {
        // Initialize variables to track the maximum subarray sums
        int currentMax = nums[0]; // Maximum sum ending at the current position
        int globalMax = nums[0];  // Overall maximum sum across the array

        // Traverse the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decide to either extend the current subarray or start a new one
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Update the global maximum subarray sum
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Find and print the maximum subarray sum
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }
}
