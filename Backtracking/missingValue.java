// 2019a 85
public class missingValue {
    public static int missingValue(int[] arr) {
        int diff = Math.min(arr[1]-arr[0], arr[2]-arr[1]);
        int i = 0;
        for (i = 0; i < arr.length-1; i++) {
            if (arr[i+1] - arr[i] == diff)
                 continue;
            else
                break;
        }
        
        return arr[i]+diff;
    }
    public static void main(String [] args) {
        int[] arr = {7, 10, 13, 16, 22, 25};
        System.out.println("For sequence {7, 10, 13, 16, 22, 25} missing value is: "+missingValue(arr));
    }
}