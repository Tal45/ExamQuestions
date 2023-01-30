public class minimumSubK {
    public static void minimumSubK(int[] arr, int k) {
        int minSum = Integer.MAX_VALUE;
        int tmpSum = 0;
        int low = 0;
        int high = 0;
        int i = 0;       

        for (i = 0; i < k; i++) {
            tmpSum += arr[i];
        }
        minSum = tmpSum;
        tmpSum -= arr[0];
        high = i-1;
        
        for (i = k; i < arr.length; i++) {
            tmpSum += arr[i];
            if (tmpSum < minSum) {
                minSum = tmpSum;
                high = i;
                low = i-k+1;
            }
            tmpSum -= arr[i-k+1];
        }

        System.out.println("Minimum sub-array is ("+low+","+high+")");

    }

    public static void main (String[] args) {
        int[] arr = {10, 4, 2, 5, 6, 3, 8, 1, 5, 9};

        System.out.println("\nfor k=3");
        minimumSubK(arr, 3);
        System.out.println("\nfor k=2");
        minimumSubK(arr, 2);
    }
}