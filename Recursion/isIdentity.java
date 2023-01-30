public class isIdentity {
    public static boolean isIdentity (int[][] mat, int x, int size) {
        return isIdentity(mat, x, x, x, size);
    }

    private static boolean isIdentity (int[][] mat, int row, int col, int x, int size) {
        
        if (row >= mat.length || col >= mat[0] .length)
            return false;
        if (row != col && mat[row][col] != 0)
            return false;
        if (row == col && mat[row][col] != 1)
            return false;
        if (row == x+size -1 && col == x+size -1)
            return true;
        if (col == x+size-1)
            return isIdentity(mat,row+1,x, x, size);

        return isIdentity(mat, row, col+1, x, size);

    }
    public static int maxMatrix(int[][] mat) {
        return maxMatrix(mat, 0, 0);
    }
    private static int maxMatrix(int[][] mat, int row, int col) {
        if (row >= mat.length || col >= mat[0].length)
            return Integer.MIN_VALUE;
        
        if (isIdentity(mat, row, mat[0].length - 1 - row))
            return mat[0].length-1-row;
        
        return maxMatrix(mat, row+1, col+1);    
    }
    public static void main(String[] args) {
        int a[][] = {{1,2,3,2,0,1,2},
                {0,1,0,0,0,3,0},
                {0,0,1,0,0,0,0},
                {5,0,0,1,0,0,0},
                {7,0,0,0,1,0,0},
                {8,0,0,0,0,1,0},
                {1,0,0,0,0,0,0}};
        System.out.println("For matrix: \n{1,2,3,2,0,1,2}\n{0,1,0,0,0,3,0}\n{0,0,1,0,0,0,0}\n{5,0,0,1,0,0,0}\n{7,0,0,0,1,0,0}\n{8,0,0,0,0,1,0}\n{1,0,0,0,0,0,0}\n");

        System.out.println("for x=1, size= 4: "+isIdentity(a, 1, 4));
        System.out.println("for x=4, size= 3: "+isIdentity(a, 4, 3));
        
        System.out.println(maxMatrix(a));
    }
}