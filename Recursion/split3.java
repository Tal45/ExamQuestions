public class split3 {
    public static boolean split3 (int[] arr) {
        return split3(arr,0,0,0,0);
    }
    private static boolean split3 (int[] arr, int sum1, int sum2, int sum3, int i){
        if (i == arr.length)
            return (sum1 == sum2 && sum2 == sum3);
        
        return split3(arr, sum1+arr[i], sum2, sum3, i+1) ||
                split3(arr, sum1, sum2+arr[i], sum3, i+1) ||
                split3(arr,sum1,sum2, sum3+arr[i], i+1);
    }
    
    public static void main (String [] args) {
        int[] a = {8,4,7,1,2,3,5};
        int[] b = {4,7,1,2,3,5};
        
        System.out.println("For {8,4,7,1,2,3,5}: "+ split3(a));
        System.out.println("For {4,7,1,2,3,5}: "+split3(b));
    }
}