public class cntTrueReg { 
    public static int cntTrueReg(boolean[][] mat) {
        return cntTrueReg(mat, 0, 0);
    }
    private static int cntTrueReg(boolean[][] mat, int row, int col) {
        if (row >= mat.length) 
            return 0;
        if (col >= mat[0].length)
            return cntTrueReg(mat, row+1, 0);
        if (mat[row][col]) {
            sweep(mat, row, col);
            return 1 + cntTrueReg(mat,row,col+1);
        }
        
        return cntTrueReg(mat,row,col+1);     
    }
    private static void sweep(boolean[][] mat, int row, int col) {
        if (row<0 || col<0 || row>=mat.length || col>=mat[0].length)
            return;
        if (mat[row][col]) {
            mat[row][col] = false;
            sweep(mat, row, col+1);
            sweep(mat, row, col-1);
            sweep(mat, row+1, col);
            sweep(mat, row-1, col); 
        }
    }
    public static void main (String[] args) {
        boolean[][] mat = { {false,false,false,false,true},
                            {false,true,true,true,false},
                            {false,false,true,true,false},
                            {true,false,false,false,false},
                            {true,true,false,false,false}};
        System.out.println(cntTrueReg(mat));
    }
}
