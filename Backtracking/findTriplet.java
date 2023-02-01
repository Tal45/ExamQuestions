public class findTriplet {
    public static int findTriplet (int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int j = low+1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int[] finalNum = new int[3];
        
        while (j!=high) {
            sum = arr[low] * arr[j] * arr[high];
            if (sum > max) {
                max = sum;  
                finalNum[0] = arr[low];
                finalNum[1] = arr[j];
                finalNum[2] = arr[high];
            }
            
            j++;
            if (j==high) {
                low++;
                j = low+1;
            }
        }
        System.out.println(finalNum[0] + " " + finalNum[1] + " " + finalNum[2] +" = "+max);
        return max;
    }

    public static void main(String[] args) {
        int[] a = {-4, 1, -8, 6 ,9};
        System.out.println(findTriplet(a));

        int[] b = {-90, 1, 5, 20 ,-90, 90, 1};
        System.out.println(findTriplet(b));
    }
}
