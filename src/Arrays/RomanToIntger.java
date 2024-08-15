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


}

