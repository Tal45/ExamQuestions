// Time complexity O(n^2)
// 2017a 86
public class countTriplets {
    public static int countTriplets (int[] arr, int num) {
        int low = 0;
        int i = low+1;
        int high = arr.length-1;
        int count = 0;
        int sum;
        
        while (i != high) {
            sum = arr[low] + arr[i] + arr[high];
            if (sum < num) {
                count += high - i;
                i++;
                if (i == high) {
                    low++;
                    i = low+1;
                }
            }
            else 
                high--;
        }
        return count;
    }
    public static void main (String[] args) {
        int[] a = {1,3,4,5,7};
        System.out.println("For {1,3,4,5,7}, num = 12: " +countTriplets(a, 12));
        int[] a1 = {-2, 0 ,1 ,3};
        System.out.println("For {-2, 0 ,1 ,3}, num = 2: "+countTriplets(a1, 2));
    }
}
