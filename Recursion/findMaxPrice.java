// 2021a 70
public class findMaxPrice {
    public static int findMaxPrice(int[] prices, int n) {
        return findMaxPrice(prices, n, 1, 0);
    }
    private static int findMaxPrice(int[] prices, int n, int i, int sum) {
        if (i >= prices.length || n<0)
            return 0;
        if (n==0)
            return sum;
            
        int add = 0, next = 0;
        add = findMaxPrice(prices, n-i, i, sum+prices[i]);
        next = findMaxPrice(prices, n, i+1, sum);
        
        return Math.max(add,next);
    }
    public static void main(String[] args) {
        int[] p = {0,1,3,10,9,10,17,17,20};
        System.out.println("For {0,1,3,10,9,10,17,17,20}, n=8: " +findMaxPrice(p, 8));
        p[1] = 4;
        System.out.println("For {0,4,3,10,9,10,17,17,20}, n=8: " +findMaxPrice(p, 8));
    }
}