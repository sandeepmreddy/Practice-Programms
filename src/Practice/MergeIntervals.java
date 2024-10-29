package Practice;

import java.util.Arrays;
import java.util.LinkedList;

//T O(nlogn) S O(logN) (or O(n))
class MergeIntervals {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0], b[0]));
       LinkedList<int []> merged = new LinkedList<>();
       for(int[] interval: intervals) {
           if (merged.isEmpty() || merged.getLast()[1] < interval[0])
           {
               merged.add(interval);
           }else
           {
               merged.getLast()[1] = Math.max(merged.getLast()[1],interval[1]);
           }

       }
       return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        // Correctly initialized example array
        int[][] intervals = new int[][]{{1,3}, {2,6}, {8,10}, {15,18}};

        // Creating an instance of MergeIntervals to call the merge method
        MergeIntervals merger = new MergeIntervals();
        int[][] mergedIntervals = merger.merge(intervals);

        System.out.println("Merged intervals: ");
        for (int[] interval : mergedIntervals) {
            System.out.println(Arrays.toString(interval));
        }
    }
}