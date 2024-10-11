package Arrays.Esay;

public class ReverseWords {
    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            reversed.append(words[i] +" ");
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World Java";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }
}
