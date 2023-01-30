public class longestSequence {
    // Time complexity O(n)
    public static int longestSequence(int [] a, int k) {
        int low = 0, high = 0;
        int longest = -1;
        int countZero = 0;

        for (high = 0; high < a.length; high++) {
            if (a[high] == 0)
                countZero++;
            if (countZero > k) {
                if (high - low > longest)
                    longest = high - low;
                while (countZero > k) {
                    if (a[low] == 0)
                        countZero--;
                    low++;
                }
            }
        }
        if (countZero <= k && low == 0)
            return a.length;
        return longest;
    }

    public static void main (String[] args){
        int[] a = {1,1,0,1,1,0,1,1,1,1,0,0};
        System.out.println("{1,1,0,1,1,0,1,1,1,1,0,0}");
        System.out.println("For k = 0: "+longestSequence(a, 0));
        System.out.println("For k = 1: "+longestSequence(a, 1));
        System.out.println("For k = 2: "+longestSequence(a, 2));
        System.out.println("For k = 3: "+longestSequence(a, 3));
        System.out.println("For k = 4: "+longestSequence(a, 4));
    }
}