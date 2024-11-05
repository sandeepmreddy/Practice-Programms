package Arrays.FloydsTortoiseAndHare;

public class FindDuplicate_NA {
    public static int findDuplicate(int[] nums) {
        // Step 1: Initialize pointers
        int slow = nums[0];
        int fast = nums[0];
        
        // Step 2: Move slow pointer by 1 and fast pointer by 2 until they meet
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        // Step 3: Reset one pointer to start and move both by 1 to find the entry point of the cycle
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow; // or return fast; both are at the duplicate number
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2}; // Example array
        int duplicate = findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicate);
    }
}
