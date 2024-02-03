package imp;

public class ReverseString1 {

    public static void main(String[] args) {
        String str= "abcde ghij klmn xyz";
        char[] charArray =  str.toCharArray();

        String reverseChar = "";

        for(int i= charArray.length-1;i>=0;i--)  {
            reverseChar =reverseChar+ charArray[i];
      }
        System.out.println(new String(reverseChar));
    }

}
