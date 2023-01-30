public class lengthPath {
    public static int lengthPath(char[][] mat, String pattern) {
        if (pattern.indexOf(mat[0][0]) == -1)
            return 0;
        return lengthPath(mat, pattern, 0, 0);
    }
    private static int lengthPath(char[][] mat, String p, int row, int col) {
        if (row<0||col<0||row>=mat.length||col>=mat[0].length)
            return 0;
        if (mat[row][col] == '0')
            return 0;
        char tmp = mat[row][col];
        mat[row][col] = '0';
        
        int right=0,left=0,up=0,down=0;
        if (p.indexOf(tmp) != -1) {
            right = 1 + lengthPath(mat,p,row,col+1);
            left = 1+ lengthPath(mat,p,row,col-1);
            up = 1 + lengthPath(mat,p,row-1, col);
            down = 1+lengthPath(mat,p, row+1, col);
        }
        mat[row][col]=tmp;
        
        return Math.max(Math.max(up,down),Math.max(left,right));
        
    }
    // incomplete! returns 13 where it should return 11
    public static int maxPath(char[][] mat, String pattern) {
        return maxPath(mat, pattern, 0, 0);
    }
    private static int maxPath(char[][] mat, String p, int row, int col) {
        if (row<0||col<0||row>=mat.length|| col>=mat.length)
            return 0;
        if (mat[row][col] == '0')
            return 0;
        char tmp = mat[row][col];
        mat[row][col] = '0';
        
        int right = 0, left=0,up=0,down=0;
        if (p.indexOf(tmp) != -1) {
            right = 1 + maxPath(mat,p,row,col+1);
            left = 1 + maxPath(mat,p,row,col-1);
            up = 1 + maxPath(mat,p,row-1, col);
            down = 1 + maxPath(mat,p, row+1, col);
        }
        else {
            right = maxPath(mat,p,row,col+1);
            left = maxPath(mat,p,row,col-1);
            up = maxPath(mat,p,row-1, col);
            down = maxPath(mat,p, row+1, col);
        }
        
        mat[row][col] = tmp;
        return Math.max(Math.max(up,down),Math.max(left,right));
        
    }
    public static void main(String [] args) {
        char[][] mat = { {'a','c','b','c','@','a'},
                         {'b','x','z','c','s','a'},
                         {'?','c','d','*','c','d'},
                         {'b','c','a','8','b','b'},
                         {'c','2','x','+','b','c'}};
        System.out.println("For \"abc\": " + lengthPath(mat, "abc"));
        
        char[][] max = { {'a','d','e','s','@','a'},
                         {'3','a','z','a','s','a'},
                         {'?','c','b','b','c','d'},
                         {'b','c','a','8','b','b'},
                         {'c','2','x','+','b','c'} };
        System.out.println("For \"abc\": " + maxPath(max, "abc"));
    }
}