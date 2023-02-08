public class printPairs {
    public static void printPairs (int[] a, int k) {
        int low = 0;
        int high = low+1;
        int tmpDiff = 0;

        while (low<a.length-1) {
            tmpDiff = Math.abs(a[low]-a[high]);
            if (tmpDiff == k) {
                System.out.println("Pair Found: ("+a[low]+","+a[high]+")");
                low++;
                high = low+1;
            }
            else if (tmpDiff < k){
                high++;
                if (high == a.length) {
                    low++;
                    high = low+1;
                }
            }
            else {
                low++;
                high = low+1;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {-7,-3,0,1,3,5,12,14,17,19,25,30};
        System.out.println("For k = 2:");
        printPairs(a, 2);
        System.out.println("For k = 6:");
        printPairs(a,6);
    }
}
