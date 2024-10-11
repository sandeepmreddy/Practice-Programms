package Arrays;

import java.util.HashMap;
import java.util.Map;

//Time complexity: O(n)
//Space complexity: O(n)
class MajorityElement3 {

    static Map.Entry<Integer,Integer> majorityEle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();
        Map.Entry<Integer,Integer> majEntry = null;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            int ele= arr[i];
            if (!map.containsKey(ele)) {
                map.put(ele, count);
            } else {
                map.put(ele, map.get(ele) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(majEntry == null || entry.getValue()>majEntry.getValue())
            {
                majEntry = entry;
            }
        }
        return majEntry;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,6,6,6,7,6};
        Map.Entry<Integer,Integer> entry=majorityEle(nums1);
            System.out.print("key "+entry.getKey()+" value ");
            System.out.print(entry.getValue());
    }
}
