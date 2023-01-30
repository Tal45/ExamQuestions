public class printExpr {
    public static int printExpr (int[] arr, int num) {
        return printExpr(arr, num, 0, 0, " ");
    }
    private static int printExpr (int[] arr, int num, int i, int sum, String p) {
        if (sum == num) {
            System.out.println(p);
            return 1;
        }
        if (i==arr.length) {    
            return 0;
        }  
        
        int try1, try2, try3;
        
        try1 = printExpr(arr, num, i+1, sum+arr[i], p+"+"+arr[i]);
        try2 = printExpr(arr, num, i+1, sum-arr[i], p+"-"+arr[i]);
        try3 = printExpr(arr, num, i+1, sum, p);
        
        return try1+try2+try3;
        
    }
    public static void main(String [] args) {
        int[] a = {1, 3, 6, 2};
        System.out.println("For {1, 3, 6, 2}, num = 4: ");
        printExpr(a, 4);
        System.out.println("For {1, 3, 6, 2}, num = 3: ");
        printExpr(a, 3);
    }
}