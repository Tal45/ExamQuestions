public class longestPath {
    public static int longestPath (int[][] mat, int x, int y) {
        return longestPath(mat, x, y, 0, 0);
    }
    private static int longestPath(int[][] mat, int x, int y, int row, int col) {
        if (row<0||col<0||row>=mat.length||col>=mat[0].length)
            return Integer.MIN_VALUE;
        if (mat[row][col] == 0)
            return Integer.MIN_VALUE;
        if (row==x && col==y)
            return 1;
        
        int tmp = mat[row][col];
        mat[row][col] = 0;
        
        int left = 1+ longestPath(mat,x,y,row,col-1);
        int right = 1+ longestPath(mat,x,y,row,col+1);
        int up = 1+ longestPath(mat,x,y,row-1,col);
        int down = 1+ longestPath(mat,x,y,row+1,col);
        
        mat[row][col] = tmp;
        return Math.max(Math.max(up,down),Math.max(left,right));
    }
    public static void main(String[] args) {
        int[][] a = {{1,1,1,1,1,1,1},
                     {1,1,0,1,0,0,1},
                     {1,1,1,1,0,1,1}};
        System.out.println("For x=2, y=5: "+longestPath(a,2,5));
    }
}