public class minPoints {
    public static int minPoints (int[][] m) {
        return minPoints(m, 0, 0, 0, 0);
    }
    private static int minPoints(int[][] m, int row, int col, int sum, int startNum) {
        if (row >= m.length || col >= m[0].length)
            return Integer.MAX_VALUE;
            
        sum += m[row][col];
        if (sum <= 0) {
            startNum += Math.abs(sum) + 1;
            sum = 1;
        }

        if (row == m.length-1 && col == m[0].length-1)
            return startNum;
        
        return Math.min(minPoints(m,row,col+1,sum,startNum),minPoints(m,row+1,col,sum,startNum));
    }
    public static void main (String[] args) {
        int[][] a = {{-2,-3,3},
                     {-5,-10,1},
                     {10,30,-5}};
        System.out.println(minPoints(a));
    }
}