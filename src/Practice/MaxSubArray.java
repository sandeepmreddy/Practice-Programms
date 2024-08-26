package Practice;

public class MaxSubArray {

    public static int findMaxSubArray(int[] arr)
    {
        int maxArrySum=0;
        int finalArrySum=0;

        for(int i=0;i<arr.length;i++)
        {
            maxArrySum = Math.max(arr[i],arr[i]+maxArrySum);
            finalArrySum= Math.max(maxArrySum,finalArrySum); //Ignore all non negative numbers
        }

        return finalArrySum;
    }

    public static void main(String[] args)
    {
        int arr[] ={-600,-1000,-500,100,2,-6,4,1,6,7,100,-200};
        int maxSubArr=findMaxSubArray(arr);
        System.out.println(maxSubArr);

    }
}
