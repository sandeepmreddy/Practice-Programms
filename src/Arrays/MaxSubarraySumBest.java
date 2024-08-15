package Arrays;

public class MaxSubarraySumBest {
    public static void main(String[] args) {
        int[] array = {-1, -5, 3, 5,15, -6, 5};
        int maxSum = findMaxSubarraySum(array);
        System.out.println("Maximum Subarray Sum is: " + maxSum);
    }

    public static int findMaxSubarraySum(int[] array) {
        int maxSoFar = array[0];
        int maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}

