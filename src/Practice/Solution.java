package Practice;

import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int[] nums1= new int[nums.length];
        java.util.HashSet set = new java.util.HashSet();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        int i = 0;
        for (Object x : set)
            nums1[i++] = (int) x;

        nums=nums1;

        System.out.println(java.util.Arrays.toString(nums));
        return nums.length;
    }

    public static void main(String[] args) {
        int[] a= {1,1,2};
        removeDuplicates(a);
    }
}