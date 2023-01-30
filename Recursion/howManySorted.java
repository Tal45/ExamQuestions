// 2018a 87
public class howManySorted {
    public static int howManySorted(int n, int max) {

        return howManySorted(n, max, 0, 1);
    }
    private static int howManySorted(int n, int max, int i, int num) {   
        if (num > max) 
            return 0;
        if (i == n)
            return 1;
        
        return howManySorted(n, max, i+1, num) + howManySorted(n, max, i, num+1);
    }
    public static void main (String[] args) {
        System.out.println("For array n = 3, max = 2: "+ howManySorted(3,2));
        System.out.println("For array n = 2, max = 3: "+ howManySorted(2,3));
        System.out.println("For array n = 3, max = 3: "+ howManySorted(3,3));
    }
}