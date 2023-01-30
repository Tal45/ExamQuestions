public class isSum {
    public static boolean isSum (int[] a, int num) {
        if (num == 0)
            return true;

        return isSum(a, num, 0, 0, 0);
    }

    private static boolean isSum(int[] a, int num, int i, int cnt, int sum){
        if (cnt == 3)
            return false;
        if (i>=a.length)
            return sum==num;
        if (sum == num)
            return true;
        
        return isSum(a, num, i+1, cnt+1, sum+a[i]) ||
               isSum(a, num, i+1, 0, sum);
    }
    public static void main (String [] args) {
        
        int[] a = {5,4,2,1,3};
        System.out.println("Array: {5,4,2,1,3}");
        System.out.println("For num=0: "+isSum(a, 0));
        System.out.println("For num=8: "+isSum(a, 8));
        System.out.println("For num=9: "+isSum(a, 9));
        System.out.println("For num=2: "+isSum(a, 2));
        System.out.println("For num=11: "+isSum(a, 11));
        System.out.println("For num=17: "+isSum(a, 17));
    }
}