package Arrays;
//Time complexity: O(n)
//Space complexity: O(1)
public class RotateArray {
        static void rotate1(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
        public static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8};
         rotate1(nums1, 3);
         for(int num : nums1)
         System.out.print(num);
    }
}
