public class kAlmostSearch {
    public static int kAlmostSearch (int[] a, int num) {
        int low = 0;
        int high = a.length-1;
        int mid = 0;
        while (low < high && high-low!=1) {
            mid = (low+high)/2;       
            if (a[mid] == num) {
                return mid;
            }
            else if (a[mid] > num) {
                high = mid-1;
            }
            else if (a[mid] < num && a[mid] > 0) {
                low = mid+1;
            }
            if (a[mid] == 0) {
                int tmp = (mid+high) / 2;
                if (a[tmp] == num)
                    return num;
                if (a[tmp] > num) {
                    high = tmp-1;
                }
                else if (a[tmp] < num && a[tmp] != 0)
                    low = tmp+1;
                else if (a[tmp] == 0) {
                    tmp = (low+mid) / 2;
                    if (a[tmp] == num)
                        return num;
                    if (a[tmp] > num)
                        high = tmp-1;
                    else if (a[tmp] < num && a[tmp] != 0)
                        low = tmp+1;
                }
            }
        }
        return -1;
    }
    public static void main (String [] args) {
        int [] a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
        System.out.println("a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0}");
        System.out.println("For kAlmostSearch(a,9): "+kAlmostSearch(a,9));
        System.out.println("For kAlmostSearch(a,31): "+kAlmostSearch(a,31));
        System.out.println("For kAlmostSearch(a,30): "+kAlmostSearch(a,30));
    }
}