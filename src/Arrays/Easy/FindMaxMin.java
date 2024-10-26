package Arrays.Easy;

public class FindMaxMin {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8, -1, 4, 10, 12, -5, 6};

        // Assuming the first element is the max and min
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

