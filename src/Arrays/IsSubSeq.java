package Arrays;

// Time Complexity: O(∣T∣) Target String
// Space Complexity: O(1)
class IsSubSeq {

    public static boolean isSubsequence(String s, String t) {
        Integer leftBound = s.length(), rightBound = t.length();
        Integer pLeft = 0, pRight = 0;

        while (pLeft < leftBound && pRight < rightBound) {
            // move both pointers or just the right pointer
            if (s.charAt(pLeft) == t.charAt(pRight)) {
                pLeft += 1;
            }
            pRight += 1;
        }
        return pLeft == leftBound;
    }

    public static void main(String[] args)
    {
        String s="abc"; //amc
        String t="ahfhbtgcjm";

        System.out.print(isSubsequence(s,t));
    }
}
