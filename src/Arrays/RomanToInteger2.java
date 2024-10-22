package Arrays;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevVal = 0;

        // Iterate from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentVal = romanMap.get(s.charAt(i));

            // If the current value is smaller than the previous value, subtract it
            if (currentVal < prevVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }

            // Update the previous value for the next iteration
            prevVal = currentVal;
        }

        return result;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV"; // Example: 1994
        int integerValue = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);
    }
}
