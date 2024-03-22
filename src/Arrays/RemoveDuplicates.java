package Arrays;
//Time complexity: O(n)
//Space complexity: O(1)
public class RemoveDuplicates {

    static void removeDulicates1(int[] nums1)
    {
        int index =1;
        for(int i=1;i< nums1.length;i++)
        {
            if(nums1[i-1] !=nums1[i])
            {
                nums1[index++] = nums1[i];
            }
        }
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,3,3,3,6,7,8};
        removeDulicates1(nums1);
        for(int num : nums1)
        {
            System.out.print(num);
        }
    }

}
