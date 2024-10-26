package Arrays.Easy;

import java.util.Arrays;

public class KthLargeSmall {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5, 6};
        int k = 3; // Example for finding the 3rd largest and smallest elements

        // Sort the array
        Arrays.sort(array);

        // Kth smallest element (K-1 because of zero indexing)
        int kthSmallest = array[k - 1];

        // Kth largest element (Length - K because of zero indexing)
        int kthLargest = array[array.length - k];

        System.out.println("Kth (" + k + ") smallest element: " + kthSmallest);
        System.out.println("Kth (" + k + ") largest element: " + kthLargest);
    }
}

