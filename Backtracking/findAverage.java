//2021a 85
public class findAverage {
    public static boolean findAverage(int[] arr, double x) {
        int low = 0;
        int high = arr.length-1;
        double avg;
        double sum = 0;
        
        for (int i = 0; i < arr.length; i++)
            sum+= arr[i];
        
        while (low <= high) {
            avg = sum/(high-low+1);
            if (avg == x) {
                System.out.println(low+" --- "+high);
                return true;
            }
            else if (avg > x) {
                sum-= arr[high];
                high--;
            }
            else {
                sum-= arr[low];
                low++;
            }
        }
        return false;
    }
    
    public static void main (String[] args) {
        int[] a = {2,3,8,14,15,35};
        System.out.println("For x = 8: "+findAverage(a,8));
        System.out.println("For x = 2.5: "+findAverage(a,2.5));
        System.out.println("For x = 10: "+findAverage(a,10));
        System.out.println("For x = 8.5: "+findAverage(a,8.5));
    }
}