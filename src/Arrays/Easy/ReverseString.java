package Arrays.Easy;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        // Convert the character array back to string
        return new String(charArray);
    }
}
