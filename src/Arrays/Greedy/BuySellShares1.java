package Arrays.Greedy;


class BuySellShares1 {

    //Time complexity: O(n2)
    //Space complexity: O(1)
    static int buySellMaxProfitBrute(int[] arr) {
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr.length;j++)
            {
                int profit = arr[i] -arr[j];
                if(profit>maxProfit)
                {
                    maxProfit=profit;
                }
            }
        }

        return maxProfit;
    }
    //Time complexity: O(n)
    //Space complexity: O(1)
    static int buySellMaxProfit(int[] arr) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
            {
                min= arr[i];
            }
            if(arr[i]-min>maxProfit)
            {
                maxProfit = arr[i] - min;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args)
    {
        int[] nums1 = {1,2,3,6,6,6,7,6,30};
        //int maxProfit=buySellMaxProfitBrute(nums1);
        int maxProfit=buySellMaxProfit(nums1);
        System.out.print(maxProfit);
    }
}
