package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RomanToIntger {

    // Method to convert a Roman numeral to an integer
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < prevValue) {
                sum -= currentValue;
            } else {
                sum += currentValue;
            }
            prevValue = currentValue;
        }

        return sum;
    }



    public static void main(String[] args) {
        String roman = "MCMXCIV"; // Example input
        //MCMXCIV=1000+900+90+4 =1994
        int num1 = romanToInt(roman);

        System.out.println(num1  );
    }

    public static class DistinctElements {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3, 4, 5};
            int[] array2 = {4, 5, 6, 7, 8};

            Set<Integer> distinctElements = findDistinctElements(array1, array2);

            System.out.println("Distinct elements: " + distinctElements);
        }

        public static Set<Integer> findDistinctElements(int[] array1, int[] array2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            Set<Integer> result = new HashSet<>();

            // Add elements of array1 to set1
            for (int num : array1) {
                set1.add(num);
            }

            // Add elements of array2 to set2
            for (int num : array2) {
                set2.add(num);
            }

            // Add all elements to result set (this will contain all unique elements)
            result.addAll(set1);
            result.addAll(set2);

            // Remove common elements to retain only distinct ones
            for (int num : array1) {
                if (set2.contains(num)) {
                    result.remove(num);
                }
            }

            for (int num : array2) {
                if (set1.contains(num)) {
                    result.remove(num);
                }
            }

            return result;
        }
    }
}

