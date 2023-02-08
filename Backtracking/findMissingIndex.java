// time complexity O(logn)
public class findMissingIndex {
    public static int findMissingIndex(int[] a) {
        int diff = Math.min(a[2]-a[1], a[1]-a[0]);
        int low = 0;
        int high = a.length-1;
        int mid=0;
        int invalidValue=0;
        
        // arithmetic progressing finding An: 
        // an = a1 + (n-1) * d
        
        while (low<=high) {
            mid = (high+low)/2;
            if (a[mid] == a[0] + (mid * diff)) {
                low = mid+1;
            }
            else {
                invalidValue = mid;
                high = mid-1;
            }
        }
        return invalidValue;
    }
    public static void main(String[] args) {
        int[] a = {22,24,26,32,34,36,38,40};
        int[] a1 = {22,26,28};
        int[] a2 = {2,4,6,8,10};
        int[] a3 = {10,20,30,50,60,80,90};
        int[] a4 = {50,100,200,250,300};
        
        System.out.println("for {22,24,26,32,34,36,38,40}: "+findMissingIndex(a));
        System.out.println("for {22,26,28}: "+findMissingIndex(a1));
        System.out.println("for {2,4,6,8,10}: "+findMissingIndex(a2));
        System.out.println("for {10,20,30,50,60,80,90}: "+findMissingIndex(a3));
        System.out.println("for {50,100,200,250,300}: "+findMissingIndex(a4));
    }
}
