package algo.BinarySearch;
//This problem is a classic example of a greedy algorithm that can be solved using binary search.
//Time complexity: O(n⋅logm) Space complexity: O(1)
//Let n be the length of the input array piles and m be the maximum number of bananas in a single pile from piles.
class KokoBanana {
    public int minEatingSpeed(int[] piles, int h) {
        // Initalize the left and right boundaries
        int left = 1, right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            // Get the middle index between left and right boundary indexes.
            // hourSpent stands for the total hour Koko spends.
            int middle = (left + right) / 2;
            int hourSpent = 0;

            // Iterate over the piles and calculate hourSpent.
            // We increase the hourSpent by ceil(pile / middle)
            for (int pile : piles) {
                hourSpent += Math.ceil((double) pile / middle);
            }

            // Check if middle is a workable speed, and cut the search space by half.
            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        // Once the left and right boundaries coincide, we find the target value,
        // that is, the minimum workable eating speed.
        return right;
    }
    public static void main(String args[])
    {
        System.out.println("ele ");
        int arr[] ={3,6,7,11};
        //At speed 4
        //int arr[]={1,2,2,3} // total 8 hours
        int h =8; //maxHours
        KokoBanana bs = new KokoBanana();
        int rate = bs.minEatingSpeed(arr, h);
        System.out.println("Rateper hour "+rate);
        //Output rate it eat for every hour: 4
    }
}
