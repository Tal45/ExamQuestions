public class longestWorm {
    public static int longestWorm(int[][] mat) {
        return longestWorm(mat, 0, 0, 0);
    }
    private static int longestWorm(int[][] mat, int row, int col, int max) {
        if (col >= mat[0].length)
            return longestWorm(mat, row+1, 0, max);
        if (row == mat.length-1 && col == mat[0].length-1)
            return max;
        
        max = Math.max(max, findWorm(mat,row,col,mat[row][col]-1));
        
        return longestWorm(mat,row,col+1,max);
    }
    private static int findWorm(int[][] mat, int row, int col, int prev) {
        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length)
            return 0;
        if (mat[row][col] == -10)
            return 0;
        if (mat[row][col] != prev+1)
            return 0;
        
        int tmp = mat[row][col];
        mat[row][col] = -10;
        
        int left, right, up, down;
        left = 1+ findWorm(mat,row,col-1,tmp);
        right = 1+ findWorm(mat,row,col+1,tmp);
        up = 1+ findWorm(mat,row-1,col,tmp);
        down = 1+ findWorm(mat,row+1,col,tmp);
        mat[row][col] = tmp;
        
        return Math.max(Math.max(left,right),Math.max(up,down));
    }
    public static void main(String[] args) {
        int[][] mat = { {3,13,15,28,30},
                        {50,51,52,29,30},
                        {51,10,53,54,55},
                        {53,12,14,53,11} };
        System.out.println(longestWorm(mat));
    }
}