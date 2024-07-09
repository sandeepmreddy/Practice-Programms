package Arrays;
// Time complexity: O(nm)
//Space complexity: O(1)
public class FirstOccurrenceIndexAlgo {

    public static void main(String[] args) {
        String haystack = "Helloworldhiworld";
        String needle = "world";


        int index = strStr(haystack,needle);
        System.out.println(index);
    }

    public static int strStr(String haystack, String needle) {
        int m = needle.length();
        int n = haystack.length();

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                if (needle.charAt(i) != haystack.charAt( i)) {
                    break;
                }
                if (i == m - 1) {
                    return windowStart;
                }
            }
        }

        return -1;
    }
}
