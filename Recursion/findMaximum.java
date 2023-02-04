// 2020a 85
public class findMaximum {
    public static int findMaximum(int[][] mat) {
        if (mat[0][0] == -1)
            return -1;
        
        return findMaximum(mat, 0, 0, 0);
    }
    private static int findMaximum(int[][] mat, int row, int col, int sum) {
        if (row >= mat.length || col < 0 || col >= mat[0].length)
            return 0;
        if (mat[row][col] == -10)
            return 0;
        if (mat[row][col]==-1)
            return sum;
            
        int tmp = mat[row][col];
        mat[row][col] = -10;
        
        int right = 0, left = 0, down = 0;
        if (row%2==0)
            right = findMaximum(mat, row, col+1, sum+tmp);
        else
            left = findMaximum(mat,row,col-1,sum+tmp);
        down = findMaximum(mat,row+1, col, sum+tmp);
        
        mat[row][col] = tmp;
        
        return Math.max(Math.max(left,right), down);
    }
    public static void main(String[] args) {
        int[][] a = { {1,1,-1,1,1},
                      {1,0,0,-1,1},
                      {1,1,1,1,-1},
                      {-1,-1,1,1,1},
                      {1,1,-1,-1,1}};
                      
        System.out.println(findMaximum(a));
    }
}