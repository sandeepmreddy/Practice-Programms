package Arrays;
//Time Complexity: O(N)
//Space Complexity :O(1)
public class LengthLastWord {

    static int lengthLastWord(String s)
    {
        int l=s.length();
        int count=0;
        while(l>0)
        {
            l--;
           if(s.charAt(l)!=' ')
           {
               count++;
           }else if(count>0)
           {
               return count;
           }
        }
        return count;
    }

    public static void main(String[] args)
    {
      String s= "Hello world news wonderworld ";
        int j= lengthLastWord(s);
        System.out.print(j+"\n");
    }
}
