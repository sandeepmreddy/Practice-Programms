package Arrays;

public class RotateArray1 {

    // Function to rotate the array
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        // Normalize k if it's larger than the array size
        k = k % n;

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of positions to rotate

        // Rotate the array
        rotate(nums, k);

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
