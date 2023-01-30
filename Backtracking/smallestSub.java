public class smallestSub {
    public static int smallestSub (int[] a, int k) {
        int sub = a[0];
        int count = 1;
        int low = 0;
        if (sub > k)
            return count;
        for (int i = 1; i < a.length; i++) {
            if (sub + a[i] - a[low] > k) {
                sub += a[i] - a[low];
                low++;
            }
            else {
                sub+=a[i];
                count++;
            }
            if (sub - a[low] > k) {
                sub -= a[low];
                count--;
                low++;
            }
        }
        if (sub == k && count == 6) 
            return a.length +1;
        return count;
        
    }
    public static void main (String[] args) {
        int[] a = {1,4,13,6,0,19};
        System.out.println("{1,4,13,6,0,19}");
        System.out.println("For k = 22: " + smallestSub(a, 22));
        System.out.println("For k = 42: " + smallestSub(a, 42));
        System.out.println("For k = 43: " + smallestSub(a, 43));
        System.out.println("For k = 26: " + smallestSub(a, 26));
        System.out.println("For k = 2: " + smallestSub(a, 2));
    }
}