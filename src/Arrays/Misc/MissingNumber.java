package Arrays.Misc;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int total = (n+1) * (n + 2) / 2;
        int sum = 0;
        
        for (int num : nums) {
            sum += num;
        }
        
        return total - sum;
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = {10,9,8,1,2,3,4,5,7};
        int num= missingNumber(nums);
        System.out.println("missing num "+num);
    }
}
