public class balancedPartition {
    public static boolean balancedPartition(int[] arr) {
        return balancedPartition(arr, 0, 0, 0, 0, 0);
    }
    private static boolean balancedPartition(int[] arr, int i, int c1, int c2, int sum1, int sum2) {
        if (i==arr.length)
            return (c1==c2) && (sum1==sum2);
        
        return balancedPartition(arr, i+1, c1+1, c2, sum1+arr[i], sum2) ||
                balancedPartition(arr, i+1, c1, c2+1, sum1, sum2+arr[i]);
    }
    public static void main(String[] args) {
        int[] a = {13,-9,14,12,5,-3};
        int[] b = {-9,14,-12,5,-3};
        
        System.out.println("For {13,-9,41,12,5,-3}: "+balancedPartition(a));
        System.out.println("For {-9,41,-12,5,-3}: "+balancedPartition(b));
    }
}