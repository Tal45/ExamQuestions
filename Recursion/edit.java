public class edit {
    public static int edit (String str1, String str2) {
        return edit(str1, str2, str1.length(), str2.length());
    }
    private static int edit (String str1, String str2, int len1, int len2) {
        if (str1.length() == 0)
            return len1 + len2;
        
        if (str2.indexOf(str1.charAt(0)) != -1) {
            len1--;
            len2--;
        }
        
        return edit(str1.substring(1), str2, len1, len2);
    }
    
    public static void main (String [] args) {
        System.out.println("For str1 = geek, str2 = gesek: "+ edit("geek","gesek"));
        System.out.println("For str1 = sunday, str2 = saturday: "+ edit("sunday","saturday"));
    }
}