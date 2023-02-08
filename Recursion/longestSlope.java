public class longestSlope {
    public static int longestSlope (int[][] mat, int num) {
        return longestSlope(mat,num,0,0,0);
    }
    private static int longestSlope(int[][] mat, int num, int row, int col, int max) {
        if (col >= mat[0].length) 
            return longestSlope(mat,num,row+1,0,max);
            
        if (row == mat.length-1 && col == mat[0].length-1)
            return max;
        
        max = Math.max(max, findSlope(mat,num,row,col,mat[row][col] + num));
        
        return longestSlope(mat, num, row, col+1, max);
    }
    private static int findSlope(int[][] mat,int num, int row, int col, int prev) {
        if (row < 0 || col < 0 || col >= mat[0].length || row >= mat.length)
            return 0;
        if (mat[row][col] == -10) 
            return 0;
        if (prev - num != mat[row][col]) 
            return 0;
        
        int tmp = mat[row][col];
        mat[row][col] = -10;
        
        int left = 1+ findSlope(mat,num,row,col-1, tmp);
        int right = 1+ findSlope(mat,num,row,col+1, tmp);
        int down = 1+ findSlope(mat,num,row+1,col,tmp);
        int up = 1+ findSlope(mat,num,row-1,col,tmp);
        
        mat[row][col] = tmp;
        
        return Math.max(Math.max(left,right),Math.max(up,down));
    }
    public static void main(String[] args) {
        int[][] mat = {{3,13,15,28,30},
                       {55,54,53,27,26},
                       {54,12,52,51,50},
                       {50,10,8,53,11}};
        System.out.println("For num = 1: "+longestSlope(mat, 1));
        System.out.println("For num = 2: "+longestSlope(mat, 2));
    }
}