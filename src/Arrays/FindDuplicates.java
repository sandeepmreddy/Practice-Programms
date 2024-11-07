package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Calculate the index based on value
            
            if (nums[index] < 0) {
                // If already negative, it means the number has been seen before
                duplicates.add(Math.abs(nums[i]));
            } else {
                // Mark the number as visited by making it negative
                nums[index] = -nums[index];
            }
        }
        
        // Optional: Restore the array if needed
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println("Duplicates: " + duplicates); // Output: [2, 3]
    }
}
