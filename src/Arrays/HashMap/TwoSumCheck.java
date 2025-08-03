package Arrays.HashMap;

import java.util.HashSet;
import java.util.Set;

public class TwoSumCheck {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            if (set.contains(target - num)) {
                found = true;
                break;
            }
            set.add(num);
        }

        System.out.println("Pair Exists: " + found);
    }
}
