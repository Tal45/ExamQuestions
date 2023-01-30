// Cheap route class from 2022c -91
public class cheapRt {
    public static int cheapRt(int[] stations, int step1, int step2, int limit) {
        return cheapRt(stations, 0, "", step1, step2, limit, 0);
    }
    private static int cheapRt(int[] stations, int sum, String p, 
                                int step1, int step2, int limit, int i) {
        if (i >= stations.length) {
            return Integer.MAX_VALUE;
        }
        if (limit < 0)
            return Integer.MAX_VALUE;
        if (i==stations.length-1) {
            sum += stations[i];
            System.out.println(p+" "+i+" ="+sum);
            return sum;
        }
        int try1 = Integer.MAX_VALUE, try2 = Integer.MAX_VALUE;
        
        try1 = cheapRt(stations, sum+stations[i], p+i+" ", step1, step2, limit, i+step1);
        try2 = cheapRt(stations, sum+stations[i], p+i+" ", step1, step2, limit-1, i+step2);
        
        return Math.min(try1,try2);
    }
    public static void main(String[]args) {
        int[] a = {2,4,8,3,10,1,12,3,2};
        System.out.println("for cheapRt(stations, 3, 2, 4) min is: "+cheapRt(a, 3, 2, 4));
        System.out.println("\nfor cheapRt(stations, 3, 6, 4) min is: "+cheapRt(a, 3, 6, 4));
    }
}