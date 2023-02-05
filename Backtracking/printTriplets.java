//2020a 87
// time complexity O(n^2)
public class printTriplets {
    public static void printTriplets (int[] a, int num) {
        int low, high, i;
        int sum = 0;
        
        for (i=0; i < a.length-2; i++) {
            low = i+1;
            high = a.length-1;
            
            while (low < high) {
                sum = a[i] * a[low] * a[high];
                if (sum == num){
                    System.out.println(a[i]+" "+a[low]+" "+a[high]);
                    low++;
                }
                else if (sum < num)
                    low++;
                else
                    high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8,9};
        printTriplets(a,40);
        int[] b = {1,3,6,8};
        printTriplets(b,40);
    }
}