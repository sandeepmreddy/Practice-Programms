// Java program for implementation of QuickSort
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
}
