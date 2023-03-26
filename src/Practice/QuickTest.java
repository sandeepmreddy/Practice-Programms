package Practice;

public class QuickTest {
    static int partition(int low, int high,  int arr[])
    {
        int i= low-1;
        int pi = arr[high];

        for(int j=0;j< high;j++)
        {
            if (arr[j]<pi) {
                i++;
                int temp= arr[i];
                arr[i] = arr[j];
                arr[j]=temp;

            }

        }

        int temp= arr[high];
        arr[high] = arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }

    public static void sort(int low, int high, int arr[])
    {

        if(low<high)
        {
            int pi = partition(0, high,  arr);;
            sort(0,pi-1,  arr);
            sort(pi+1,high,  arr);
        }

    }

    public static void main(String[] args) {
        System.out.println();
        int arr[] ={6,7,8,9,12,1,2,3,4,5};
        sort(0, arr.length-1,  arr);
        for(int i=0; i<= arr.length-1; i++)
        {
            System.out.println(arr[i]);
        }

    }


}
