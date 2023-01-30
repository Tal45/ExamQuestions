public class maxPath {
    public static int maxPath(int[][] mat) {
        return maxPath (mat, 0, 0, 0);
    }
    private static int maxPath (int[][] mat, int row, int col, int sum) {
        // out of boundaries
        if (row >= mat.length || col >= mat[0].length)
            return Integer.MIN_VALUE;
        // found last window
        if (row == mat.length-1 && col == mat[0].length - 1){
            sum += mat[row][col];
            return sum;
        }
        int try1 = Integer.MIN_VALUE, try2 = Integer.MIN_VALUE;
        
        // try to move in both options
        try1 = maxPath(mat, row+mat[row][col]/10, col+mat[row][col]%10, sum+mat[row][col]);
        try2 = maxPath (mat, row+mat[row][col]%10, col+mat[row][col]/10, sum+mat[row][col]);
        
        return (try1 > try2) ? try1 : try2;
    }
    
    public static void main(String[] args) {
        int [][] mat = { {12,22,23,54,11},
                         {43,35,21,20,30},
                         {34,23,43,22,30},
                         {25,31,2,20,34},
                         {10,22,10,11,10},
                         {40,13,3,1,23} };
                         
        System.out.println(maxPath(mat));     
                    
    }
}