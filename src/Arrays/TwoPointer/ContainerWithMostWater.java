package Arrays.TwoPointer;
//T O(n), S O(1) --Two Pointer
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            maxarea = Math.max(
                maxarea,
                Math.min(height[left], height[right]) * width
            );
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1,5,2,0,7, 5,4};
        int result = maxArea(nums);

        // Print the result
        System.out.println("Max water: " + result);
    }
}