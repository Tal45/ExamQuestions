// 2019b 93
// Time complexity O(n)
public class shortestRoad {
    public static int shortestRoad(int[] road1, int[] road2) {
        int sumRoad1 = 0, sumRoad2 = 0;
        for (int i = 0; i < road1.length; i++) {
            sumRoad1+=road1[i];
            sumRoad2+=road2[i];
        }
        boolean moveRoad = false;
        boolean startRoad1 = false;
        boolean startRoad2 = false;
        
        if (sumRoad1 < sumRoad2) 
            startRoad1 = true;
        else
            startRoad2 = true;
            
        int tmpSum1 = 0, tmpSum2 = 0;
        int finalRoad1 = 0, finalRoad2 = 0;
      
        for (int i = 0; i < road1.length; i++) {
            tmpSum1+=road1[i];
            tmpSum2+=road2[i];

            if (startRoad2 && sumRoad1 - tmpSum1 < sumRoad2 - tmpSum2) 
                moveRoad = true;
            
            if (startRoad1 && sumRoad2 - tmpSum2 < sumRoad1 - tmpSum1) 
                moveRoad = true;
            
            if (moveRoad) {
                finalRoad1 = tmpSum1 + (sumRoad2 - tmpSum2);
                finalRoad2 = tmpSum2 + (sumRoad1 - tmpSum1);
                break;
            }
        }
        if (!moveRoad)
            return (sumRoad1 < sumRoad2) ? sumRoad1 : sumRoad2;
        return (finalRoad1 < finalRoad2) ? finalRoad1 : finalRoad2;
    }

    public static void main (String [] args) {
        int[] r1 = {5,4,5,8,12,9,9,3};
        int[] r2 = {7,3,3,12,10,2,10,7};
        System.out.println(shortestRoad(r1,r2));
        int[] r3 = {1,2,1,1};
        int[] r4 = {2,2,1,0};
        System.out.println(shortestRoad(r4,r3));
    }
}