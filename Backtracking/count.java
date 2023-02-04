// Time complexity O(log n)
public class count {
    public static int count (int[] a, int x) {
        int low = 0;
        int high = a.length-1;
        int mid;
        int endIndex=0;
        int startIndex=0;
        
        while (low <= high) {
            mid = (low+high)/2;
            if (a[mid]>=x)
                high = mid-1;
            else
                low = mid+1;
            if (a[mid] == x) {
                startIndex = mid;
            }
        }
        low = 0;
        high = a.length-1;
        while (low<=high) {
            mid = (low+high)/2;
            if (a[mid]<=x)
                low = mid+1;
            else 
                high = mid-1;
            if (a[mid] == x)
                endIndex = mid;
        }
        return endIndex - startIndex +1;
    }
    public static void main (String[] args) {
        int[] a = {-5,-5,1,1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,67,67,99};
        System.out.println("For x = -5: "+count(a,-5));
        System.out.println("For x = 1: "+count(a,1));
        System.out.println("For x = 2: "+count(a,2));
        System.out.println("For x = 3: "+count(a,3));
        System.out.println("For x = 67: "+count(a,67));
        System.out.println("For x = -5: "+count(a,99));
    }
}