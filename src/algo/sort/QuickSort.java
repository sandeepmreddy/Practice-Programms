package algo.sort;

// Time complexity : Best and Average O(n log n) and worest O(n)2
class QuickSort
{
    int partition(int arr[], int low,int high)
    {

        int pivot = arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++)
        {

            if(arr[j]<=pivot)
            {    i++;
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }


        }

        int temp =arr[i+1];
        arr[i+1] = arr[high];
        arr[high]=temp;
        return i+1;
    }

    void sort( int arr[], int low,int high)
    {
        if(low<high) {
            int p = partition(arr, low, high);
            sort(arr, low, p - 1);
            sort(arr,p + 1, high);
        }

    }

    public static void main(String args [])
    {
       // int arr[] = {9,8,7,5,4,3,6};
        int arr[] = {11,12,14,15,10,9,8, 0,4,6,5,7};
        int n = arr.length;

        QuickSort ob11 = new QuickSort();
        ob11.sort(arr, 0, n-1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }

    }

    public static class Stack {

        private int top = -1;
        private int maxSize;
        private int[] arr;
        Stack(int maxSize)
        {
            this.maxSize = maxSize;
           arr = new int[maxSize];
            top = -1;
        }
        void push(int a)
        {
            if(top == maxSize-1)
            {
                System.out.println("algo.sort.QuickSort.Stack overflow");
            }else {
                top++;
                arr[top] = a;
            }

        }

        int pop()
        {
            if(top == -1)
            {
                System.out.println("algo.sort.QuickSort.Stack under flow");
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
                System.out.println("algo.sort.QuickSort.Stack under flow");
                return -1;
            }else {

                return arr[top];
            }

        }

        public static void main(String[] args)
        {
            Stack s=new Stack(5);
            System.out.println("algo.sort.QuickSort.Stack pop1  "+s.pop());
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);

            System.out.println("algo.sort.QuickSort.Stack top  "+s.top());

            System.out.println("algo.sort.QuickSort.Stack pop1  "+s.pop());
            System.out.println("algo.sort.QuickSort.Stack pop2  "+s.pop());

            System.out.println("algo.sort.QuickSort.Stack top  "+s.top());

        }

        // balanced brackets
        public static class BalancedBrackets {

            // function to check if brackets are balanced
            static boolean areBracketsBalanced(String expr)
            {
                // Using ArrayDeque is faster than using Stack class
                java.util.Stack<Character> stack
                        = new java.util.Stack<Character>();

                // Traversing the Expression
                for (int i = 0; i < expr.length(); i++) {
                    char x = expr.charAt(i);

                    if (x == '(' || x == '[' || x == '{') {
                        // Push the element in the algo.stack
                        stack.push(x);
                        continue;
                    }

                    // If current character is not opening
                    // bracket, then it must be closing. So algo.stack
                    // cannot be empty at this point.
                    if (stack.isEmpty())
                        return false;
                    char check;
                    switch (x) {
                        case ')':
                            check = stack.pop();
                            if (check == '{' || check == '[')
                                return false;
                            break;

                        case '}':
                            check = stack.pop();
                            if (check == '(' || check == '[')
                                return false;
                            break;

                        case ']':
                            check = stack.pop();
                            if (check == '(' || check == '{')
                                return false;
                            break;
                    }
                }

                // Check Empty Stack
                return (stack.isEmpty());
            }

            // Driver code
            public static void main(String[] args)
            {
                String expr = "([{}])";

                // Function call
                if (areBracketsBalanced(expr))
                    System.out.println("Balanced ");
                else
                    System.out.println("Not Balanced ");
            }
        }
    }
}
