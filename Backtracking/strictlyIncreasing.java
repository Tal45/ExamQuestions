// 2020a 85
// Time complexity O(n)
public class strictlyIncreasing {
    public static int strictlyIncreasing(int[] a) {
        int low = 0;
        int high = low+1;
        int count = 0;
       
        while (high < a.length) {
           if (a[high-1] < a[high]) {
               count++;
               high++;
           }
           else {
               low++;
               if (low == high) {
                   high++;
                   continue;
               }
               if (a[low] < a[high-1]) {
                   count++;
               }
           }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] a = {1,2,4,4,5};
        System.out.println("For {1,2,4,4,5}: "+strictlyIncreasing(a));
        int[] b = {1,3,2};
        System.out.println("For {1,3,2}: "+strictlyIncreasing(b));
        int[] c = {5,4,3,2,1};
        System.out.println("For {5,4,3,2,1}: "+strictlyIncreasing(c));
    }
}