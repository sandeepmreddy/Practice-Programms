package Arrays;

public class MaxSubarraySumBest1 {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArray(int[] nums) {
        // Initialize variables to track the maximum sum
        int currentMax = nums[0]; // current subarray sum
        int globalMax = nums[0];  // global maximum subarray sum

        // Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current subarray sum
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the global maximum sum if needed
            if (currentMax > globalMax) {
                globalMax = currentMax;
            }
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
