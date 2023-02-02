// 2021b 85
public class printPathWeights {
    public static void printPathWeights(int[][] m) {
        printPathWeights(m, 0, 0," ", 0);
    }

    private static boolean printPathWeights(int[][] m, int row, int col, String path,  int sum) {
        if (row >= m.length || col >= m[0].length || row < 0 || col < 0)
            return false;
        if (m[row][col] == -10)
            return false;
        if (row == m.length-1 && col == m[0].length-1) {
            sum += m[row][col];
            path+=m[row][col];
            System.out.println(path+" = "+sum);
            return true;
        }
        int tmp = m[row][col];
        m[row][col] = -10;
        
        boolean left = printPathWeights(m, row, col+1, path+tmp+"+", sum+tmp);
        boolean right = printPathWeights(m, row, col-1, path+tmp+"+", sum+tmp);
        boolean up = printPathWeights(m, row-1, col, path+tmp+"+", sum+tmp);
        boolean down = printPathWeights(m, row+1, col, path+tmp+"+", sum+tmp);
        
        m[row][col] = tmp;
        
        return left | right | up | down;
    }

    public static void main(String [] args) {
        int[][] a = {{8,4,2,4,3},
                     {6,3,8,4,5},
                     {1,4,9,9,7},
                     {2,1,7,6,5}};
        printPathWeights(a);
        
    }

}