public class kAlmostSorted {
    public static int kAlmostSorted(int[] a, int num) {
        int low = 0;
        int high = a.length-1;
        int mid = 0;
        boolean found = false;
        int ind = 0;
        int tmp;
        
        while (!found && high-low != 1) {
            mid = (low + high) /2;
            if (a[mid] == num) { 
                found = true; 
                ind = mid;
                continue;
            }
            else if (a[mid] == 0) {
                tmp = (mid + high) / 2;
                if (a[tmp] == num) {
                    found = true;
                    ind = tmp;
                    continue;
                }
                if (a[tmp] > num) 
                    high = tmp;
                if (a[tmp] < num) 
                    low = tmp;
            }
            else if (a[mid] > num) 
                high = mid;             
            else
                low = mid;
        }
        if (found) 
            return ind;
        return -1;
    }

    public static void main (String [] args) {
        int [] a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
        System.out.println("For kAlmostSorted(a,9): "+kAlmostSorted(a,9));
        System.out.println("For kAlmostSorted(a,31): "+kAlmostSorted(a,31));
        System.out.println("For kAlmostSorted(a,30): "+kAlmostSorted(a,30));
    }
}