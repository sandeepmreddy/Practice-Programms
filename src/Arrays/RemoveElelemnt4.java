package Arrays;
//Time complexity: O(n)
//Space complexity: O(1)
public class RemoveElelemnt4 {

    static int removeElement(int[] array,int ele)
    {
        int j=0;
        for(int i=0; i<array.length; i++)
        {
            if(array[i]!= ele)
            {
                array[j++]=array[i];
            }
        }
        return j;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,3,6,7,8};
        int remove =8;
        int j= removeElement(nums1, remove);
        System.out.print(j+"\n");
        for(int num : nums1)
        {
            System.out.print(num);
        }
    }
}
