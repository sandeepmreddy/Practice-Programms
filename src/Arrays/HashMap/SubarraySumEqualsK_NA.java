package Arrays.HashMap;

import java.util.HashMap;

public class SubarraySumEqualsK_NA {
    public static int subarraySum(int[] nums, int k) {
        // HashMap to store cumulative sum frequency
        HashMap<Integer, Integer> cumulativeSumFreq = new HashMap<>();
        cumulativeSumFreq.put(0, 1); // Initial sum (for cases where the sum equals k from the start)
        
        int count = 0; // To count subarrays
        int cumulativeSum = 0; // To store cumulative sum up to current index

        for (int num : nums) {
            cumulativeSum += num;

            // Check if cumulativeSum - k exists in the map, which means we've found a subarray with sum k
            if (cumulativeSumFreq.containsKey(cumulativeSum - k)) {
                count += cumulativeSumFreq.get(cumulativeSum - k);
            }

            // Update the frequency of the current cumulativeSum
            cumulativeSumFreq.put(cumulativeSum, cumulativeSumFreq.getOrDefault(cumulativeSum, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 1,2,5,0,3};
        int k = 3;
        System.out.println("Number of subarrays with sum " + k + " : " + subarraySum(nums, k));
    }
}
