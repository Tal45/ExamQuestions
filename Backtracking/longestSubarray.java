// 2022a 89
// Time complexity O(n)
//Space complexity O(1)
public class longestSubarray {
    public static int longestSubarray(int[] a){
        int low = 0;
        int high = 0;
        int startIndex = 0;
        int endIndex = 0;

        while (high +1 < a.length) {
            if (a[high]*a[high+1] < 0) {
                high++;    
            }
            else {
                if (high-low+1 > endIndex - startIndex+1) {
                    startIndex = low;
                    endIndex = high;
                }
                high++;
                low = high;
            }
        }
        System.out.println("Starting index = "+startIndex+" Ending index = "+endIndex);
        return endIndex - startIndex+1;
        
    }
    public static void main(String[] args) {
        int[] a = {-1,1,-1,-5,2,2};
        System.out.println("For {-1,1,-1,-5,2,2} returned = "+longestSubarray(a));
        int[] a1 = {3,3,2,-7,2,1,1,-2,-2};
        System.out.println("For {3,3,2,-7,2,1,1,-2,-2} returned = "+longestSubarray(a1));
        int[] a2 = {1,2,3,4,5,4};
        System.out.println("For {1,2,3,4,5,4} returned = "+longestSubarray(a2));
        int[] a3 = {1,-2,3,-4,-5,4,2,-4,6,-2};
        System.out.println("For {1,-2,3,-4,-5,4,2,-4,6,-2} returned = "+longestSubarray(a3));
    }
}