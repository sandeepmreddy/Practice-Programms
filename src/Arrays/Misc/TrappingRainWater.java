package Arrays.Misc;


public class TrappingRainWater {
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                left_max = Math.max(left_max, height[left]);
                ans += left_max - height[left];
                ++left;
            } else {
                right_max = Math.max(right_max, height[right]);
                ans += right_max - height[right];
                --right;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1,1,2,0,4,1,2,1};
        int result = trap(nums);

        // Print the result
        System.out.println("Trapping rain water: " + result);
    }
}