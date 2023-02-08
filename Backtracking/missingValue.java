// 2019a 85
// Time complexity O(logn)
// Arithmetic progression - an = a1 + (n-1)*diff
public class missingValue {
    public static int missingValue(int[] arr) {
        int diff = Math.min(arr[1]-arr[0], arr[2]-arr[1]);
        int low = 0;
        int mid;
        int high = arr.length-1;
        int missing = 0;
        
        while (low <= high) {
            mid = (low+high) / 2;
            if (arr[mid] == arr[0]+(mid*diff))
                low = mid+1;
            else {
                missing = mid;
                high = mid-1;
            }
        }
        return arr[0]+(missing*diff);
    }
    public static void main(String [] args) {
        int[] arr = {7, 10, 13, 16, 22, 25};
        System.out.println("For sequence {7, 10, 13, 16, 22, 25} missing value is: "+missingValue(arr));
    }
}
