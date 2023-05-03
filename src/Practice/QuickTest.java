package Practice;

import java.util.Stack;

public class QuickTest {
    private static boolean balanced(String str)
    {
        Stack<Character> s = new Stack<Character>();
        for(int i=0; i< str.length();i++)
        {
            char c= str.charAt(i);
            if( c == '(' || c == '{' || c == '[')
            {
                s.push(c);
            }
            if(s.isEmpty())
                return false;
            switch (c)
            {
                case ')':
                {
                    char topElement = s.pop();
                    if(topElement == '{' || topElement == '[')
                    {
                        return  false;

                    }
                    break;
                }
                case ']': {
                    char topElement = s.pop();
                    if (topElement == '{' || topElement == '(') {
                        return false;
                    }
                    break;
                }

                case '}': {
                    char topElement = s.pop();
                    if (topElement == '(' || topElement == '[') {
                        return false;
                    }
                    break;
                }

            }

        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println();
        String str="{[()]}";
        if(balanced(str))
        {
            System.out.println("balanced");
        }else
        {
            System.out.println("non balanced");
        }

    }

}
