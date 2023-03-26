public class ReverseString {

    public static void main(String[] args) {
        String str= "abcde ghij klmn xyz";
        char[] charArray =  str.toCharArray();

        char[] reverseChar = new char[charArray.length];

        for(int i= charArray.length-1, j=0;i>=0;i--,j++)  {
            reverseChar[j]=charArray[i];
      }
        System.out.println(new String(reverseChar));
    }

}
