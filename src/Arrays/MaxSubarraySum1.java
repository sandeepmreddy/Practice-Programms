package Arrays;

public class MaxSubarraySum1 {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArray(int[] nums) {
        // Initialize variables to track the maximum sum
        int currentMax = nums[0]; // current subarray sum
        int globalMax = nums[0];  // global maximum subarray sum

        // Traverse the array from the second element
        for (int i = 1; i < nums.length; i++) {
            // Update the current subarray sum without using Math.max()
            if (currentMax + nums[i] > nums[i]) {
                currentMax += nums[i];
            } else {
                currentMax = nums[i];
            }

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

        // Find and print

    }

}
