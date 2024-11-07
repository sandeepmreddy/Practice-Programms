package Arrays;

public class MissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // The difference between expectedSum and actualSum is the missing number
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Array where number 3 is missing
        int n = 6; // Total numbers from 1 to 6

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
