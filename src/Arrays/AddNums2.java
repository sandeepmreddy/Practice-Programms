package Arrays;

import java.util.HashMap;
import java.util.Map;

public class AddNums2 {

        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            // In case there is no solution, we'll just return null
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
