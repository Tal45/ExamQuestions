// 2023a 85
//  Time complexity: O(n)
public class strictInc {
    public static boolean strictInc (int[] arr, int k) {
        int i = arr.length-1;
        int sum = 0;
        
        for (int j = 0; j< arr.length; j++) {
            sum += arr[j];
        }
        
        while (i >= 0) {
            if (sum == k)
                return true;
            else if (sum > k){
                if (sum - arr[i] >= k) {
                    sum-=arr[i];
                    i--;
                }
                else 
                    i--;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        int[] arr = {1,2,3,8,27};
        System.out.println("For k = 30: "+strictInc(arr, 30));
        System.out.println("For k = 7 "+strictInc(arr, 7));
    }
}
