package algo;

// Java program for implementation of algo.QuickSort
class BinarySearch
{
    int binarySearch(int left, int right, int arr[], int x){

       while(left<=right)
       {
           int mid = left+(right-left)/2;
           if(arr[mid]==x)
           {
               return mid;
           }

           if(arr[mid]<x)
           {
               left = mid+1;
           }else
           {
               right= mid-1;
           }
       }


        return -1;
    }

    public static void main(String args[])
    {
        System.out.println("ele ");
        int arr[] ={1,3,5,7,8,10,11,14,15,16};

        BinarySearch bs = new BinarySearch();
        int ele = bs.binarySearch(0,arr.length-1,arr,161);
        System.out.println("ele "+ele);
    }
}

