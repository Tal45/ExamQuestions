// 2020b 84
public class findWord {
    public static void findWord (char[][] arr, String word) {
        int[][] mat = new int[arr.length][arr[0].length];
        boolean bool = findWord(arr, mat, 0, 0, 0,  word);
        if (bool) printArr(mat);
        else System.out.println("No Word Found");
    }

    private static boolean findWord (char[][] arr, int[][] mat, int row, int col, int i, String word) {
        if (row < 0 || col < 0 || col >= arr[0].length || row >= arr.length) 
            return false;
        if (arr[row][col] == '?')
            return false;
        if (i == word.length()) 
            return true;
        if (i != 0 && word.charAt(i) != arr[row][col])
            return false;
        if (word.charAt(i) == arr[row][col])
            i++; 

        char tmp = arr[row][col];
        arr[row][col] = '?';

        boolean right = findWord(arr, mat, row, col+1, i, word);
        boolean down = findWord (arr, mat, row+1, col, i,  word);
        boolean left = findWord(arr, mat, row, col-1, i, word);
        boolean up = findWord (arr, mat, row-1, col, i, word);

        if (right || up || down || left)
            mat[row][col] = i;

        arr[row][col] = tmp;

        return left || right || up || down;
    }

    private static void printArr(int[][] a) {
        String tmp = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) 
                tmp += a[i][j] + " ";
            tmp += "\n";
        }
        System.out.println(tmp);

    }

    public static void main (String[] args) {
        char[][] a = {{'t','z','x','c','d'},
                    {'s','h','a','z','x'},
                    {'h','w','l','o','m'},
                    {'o','r','n','t','n'},
                    {'a','b','r','i','n'} };
        findWord(a, "shalom");
        char[][] b = {{'r','z','x','c','d'},
                    {'e','h','a','z','x'},
                    {'d','b','a','o','m'},
                    {'o','z','n','t','n'},
                    {'a','b','d','i','n'} };
        findWord(b, "redband");
    }
}