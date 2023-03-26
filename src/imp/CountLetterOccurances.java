package imp;

import java.util.HashMap;

public class CountLetterOccurances {
    public static void main(String[] args) {
        String str="ab cd xyz xyz";

        HashMap map = new HashMap();
        for(int i=0;i<str.length();i++)
        {
           char c=str.charAt(i);
           if(map.containsKey(c))
            {
                Integer count = (Integer) map.get(c);
                map.put(c, count+1);
            }else
           {
               map.put(c, 1);
           }
        }
        map.forEach((k,v)-> System.out.println(k+" "+v+"   "));
    }
}
