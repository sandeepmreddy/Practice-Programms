package algo.stack;

import java.util.Map;
import java.util.Stack;

class BalancedWithMap {
    public static boolean isValid(String s) {
        Map<Character,Character> map= Map.of('{','}',
                '(',')',
                '[',']');

        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray())
        {
            if(map.containsKey(c))
            {
                stack.push(c);
            }else
            {

                if(stack.isEmpty())
                {
                    return false;
                }
                char popEle=stack.pop();
                if(map.get(popEle)!=c)
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Driver code
    public static void main(String[] args)
    {
        //String expr = "([{}])";
        String expr = "{}[]{}";

        // Function call
        if (isValid(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}




