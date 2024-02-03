package algo.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a= {11,12,14,15,10,9,8, 0,4,6,5,7};

        for(int i=0; i< a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i=0; i< a.length-1;i++)
        {
            System.out.println(a[i]);
        }
    }
}
