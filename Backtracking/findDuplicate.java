public class findDuplicate {
    public static int findDuplicate(int[] a) {
        // Time complexity O(n)
        // Space complexity O(1)
        // the algorithm takes the value of each window in the given array
        // reduces 1 and changes the sign of the value in the corresponding window
        // when we reach a number that has already appeared, the sign of the value
        // in the corresponding window will already be negative
        // thus, return the absolute value of current window
        // if no duplicates found, return -1
        for (int i = 0; i < a.length; i++) {
            int index = Math.abs(a[i]) - 1;
            if (a[index] < 0) {
                return Math.abs(a[i]);
            }
            a[index] = -a[index];
        }
        return -1;
    }

    public static void main (String[] args) {
        int [] a = {2, 4, 5, 3, 5, 1};
        System.out.println("for {2, 4, 5, 3, 5, 1}: " +findDuplicate(a));
    }
}