package Arrays.HashMap;
//Time and Space Complexity O(n)
import java.util.HashMap;
import java.util.Map;

public class TwoSumOrAddNums1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Add the current number to the map after checking for the complement
            map.put(nums[i], i);
        }
        // Return null if no solution is found
        return null;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,5,7,15};
        int[] nums2 = twoSum(nums1,18);
        for(int j=0; j< nums2.length;j++)
        {
            System.out.println("i value "+nums2[j] +" ");
        }
    }
}
