package Arrays;

public class CheckIfSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // You can change the array to test

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Is Sorted: " + isSorted);
    }
}
