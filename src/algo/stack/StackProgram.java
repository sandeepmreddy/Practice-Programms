package algo.stack;


public class StackProgram {

    private int top = -1;
    private int maxSize;
    private int[] arr;
    StackProgram(int maxSize)
    {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        top = -1;
    }
    void push(int a)
    {
        if(top == maxSize-1)
        {
            System.out.println("algo.Stack overflow");
        }else {
            top++;
            arr[top] = a;
        }

    }

    int pop()
    {
        if(top == -1)
        {
            System.out.println("algo.Stack under flow");
            return -1;
        }else {
            int topVal= arr[top];
            top--;
            return topVal;
        }

    }

    int top()
    {
        if(top == -1)
        {
            System.out.println("algo.Stack under flow");
            return -1;
        }else {

            return arr[top];
        }

    }

    public static void main(String[] args)
    {
        StackProgram s=new StackProgram(5);
        System.out.println("algo.Stack pop1  "+s.pop());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println("algo.Stack top  "+s.top());

        System.out.println("algo.Stack pop1  "+s.pop());
        System.out.println("algo.Stack pop2  "+s.pop());

        System.out.println("algo.Stack top  "+s.top());

    }
}

