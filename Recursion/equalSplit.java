public class equalSplit {
    public static boolean equalSplit(int[] arr) {
        return equalSplit(arr, 0, 0, 0, 0, 0);
    }
    private static boolean equalSplit (int[] arr, int i, int sum1, int sum2, int c1, int c2){
        if (i == arr.length) 
            return (sum1==sum2 && c1 == c2);
        
        return equalSplit(arr, i+1, sum1+arr[i], sum2, c1+1, c2) ||
                equalSplit(arr, i+1, sum1, sum2+arr[i], c1, c2+1);
    }
    public static void main (String [] args) {
        int[] a = {-3,5,12,14,-9,13};
        int[] b = {-3,5,-12,14,-9,13};
        int[] c = {-3,5,-12,14,-9};
        System.out.println("For {-3,5,12,14,-9,13}: "+ equalSplit(a));
        System.out.println("For {-3,5,-12,14,-9,13}: "+ equalSplit(b));
        System.out.println("For {-3,5,-12,14,-9}: "+ equalSplit(c));
    }
}