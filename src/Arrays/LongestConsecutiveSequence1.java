package Arrays;

import java.util.HashSet;
import java.util.Set;
//complexity is approximately O(n),overall space complexity is O(n)
public class LongestConsecutiveSequence1 {

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Create a HashSet to store the elements
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Iterate through each number in the set
        for (int num : numSet) {
            // Only check for the beginning of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Check for consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {200,6, 5, 1, 3, 2, 4,100};
        System.out.println("The longest consecutive sequence length is: " + longestConsecutive(nums1));

        // Test case 2
        int[] nums2 = {3, 8, 5, 7, 6};
        System.out.println("The longest consecutive sequence length is: " + longestConsecutive(nums2));
    }
}
