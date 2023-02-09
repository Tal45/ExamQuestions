// 2023a 85
public class countPairs {
    public static int countPairs(int n) {
        return countPairs("", n, n);
    }
    private static int countPairs(String p, int open, int close) {
        if (open < 0)
            return 0;
        if (open == 0 && open == close) {
            System.out.println(p);
            return 1;
        }
        if (open > close) {
            return 0;
        }
        
        int openBra = countPairs(p+"(", open-1, close);
        int closeBra = countPairs(p+")", open, close-1);
        
        return openBra + closeBra;
    }
}