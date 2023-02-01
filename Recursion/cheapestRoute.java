public class cheapestRoute {
    public static int cheapestRoute(int[] stations) {
        return cheapestRoute(stations, 0, 0);
    }
    private static int cheapestRoute(int[] stations, int i, int sum) {
        if (i >= stations.length) 
            return Integer.MAX_VALUE;
        if (i == stations.length-1)
            return sum+stations[i];
        
        int next = cheapestRoute(stations, i+1, sum+stations[i]);
        int skip = cheapestRoute(stations, i+2, sum+stations[i]);
        
        return Math.min(next,skip);
        
    }
    public static void main(String [] args) {
        int[] a = {2,8,3,4,7,1,3,2};
        System.out.println(cheapestRoute(a));
    }
}