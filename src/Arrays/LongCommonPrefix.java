package Arrays;

//Time complexity : O(S)  where S is the sum of all characters in all strings
//Space complexity : O(1)

public class LongCommonPrefix {
// For every iteration, We get into prefix
    public static String longCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            //Flower indexof flow is 0
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String[] args)
    {
        String[] nums1 = {"flower5","flow","flo","flower","flower1"};
        String count=longCommonPrefix1(nums1);
        System.out.print(count);

        System.out.println("\nPrint "+ "flower".indexOf("flow"));
    }
}
