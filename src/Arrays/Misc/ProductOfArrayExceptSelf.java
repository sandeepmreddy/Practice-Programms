package Arrays.Misc;

import java.util.Arrays;
//Time Complexity: O(n),Space Complexity: O(n)
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Calculate left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct; // Set output[i] to the product of all elements to the left
            leftProduct *= nums[i]; // Update leftProduct for the next index
        }

        // Step 2: Calculate right products and multiply with left products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct; // Multiply with the product of all elements to the right
            rightProduct *= nums[i]; // Update rightProduct for the next index
        }

        return output;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {5, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        
        // Print the result
        System.out.println("Product of Array Except Self: " + Arrays.toString(result));
    }
}
