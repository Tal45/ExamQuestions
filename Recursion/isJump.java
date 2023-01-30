// is jump from 2022a 89
public class isJump {
    public static boolean isJump (String str1, String str2, int step) {
        if (str1.length() < str2.length()) 
            return false;
        if (str1.length() == 0 && str2.length()!=0)
            return false;
        if (str1.charAt(0) != str2.charAt(0))
            return false;
        if (str2.length() == 1)
            return true;
        return isJump(str1.substring(step), str2.substring(1), step);
    }
    public static int strStep (String str1, String str2) {
        if (str1.charAt(0) != str2.charAt(0))
            return -1;
        return strStep (str1.substring(1), str2.substring(1), 1);
    }
    private static int strStep (String str1, String str2, int step) {
        if (str1.length() < str2.length())
            return -1;
        if (str1.length() == 0)
            return -1;
            
        if (isJump(str1, str2, step))
            return step;
        return strStep (str1.substring(1), str2, step+1);
    }
    public static void main (String[] args) {
        System.out.println(strStep("adbrcfa", "abc"));
        System.out.println(strStep("abcfbaagcxabcd", "abc"));
        System.out.println(strStep("adcfbaagcxabcd", "abc"));
        for (int i=0; i<10; i++) {
            continue;
        }
    }
}