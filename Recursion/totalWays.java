//2020a 87
public class totalWays{
    public static int totalWays(int[][] mat, int k) {
        int[][] step = new int[mat.length][mat[0].length];
        return totalWays(mat, k, 0, 0, step);
    }

    private static int totalWays(int[][] mat, int k, int row, int col, int[][] step) {
        if (row>=mat.length || col >=mat[0].length)
            return 0;
        if (row-1 >= 0 && col-1 >= 0 && step[row-1][col-1] == -10)
            k--;
        if (k < 0)
            return 0;
        if (row == mat.length-1 && col == mat[0].length-1)
            return (k==0) ? 1 : 0;

        
        step[row][col] = -10;
        
        int right = 0, down = 0;
        right = totalWays(mat, k, row, col+1, step);
        down = totalWays(mat, k, row+1, col, step);
        
        step[row][col] = 0;
        
        return right+down;
    }
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        System.out.println("| (0,0) | (0,1) | (0,2) |\n| (1,0) | (1,1) | (1,2) |\n| (2,0) | (2,1) | (2,2) |\n");
        System.out.println("For k=1: "+totalWays(a, 1));
        System.out.println("For k=2: "+totalWays(a, 2));
        System.out.println("For k=3: "+totalWays(a, 3));
        System.out.println("For k=4: "+totalWays(a, 4));
    }
}