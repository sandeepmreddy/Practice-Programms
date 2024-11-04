package algo.BinarySearch;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If middle element is greater than right element,
            // the minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum is in the left half (including mid)
                right = mid;
            }
        }

        // After the loop, left and right converge to the index of the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2,3};
        System.out.println("The minimum element is: " + findMin(nums));
    }
}
