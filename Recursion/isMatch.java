// leetcode problem: 10. Regular Expression Matching

// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
// '.' Matches any single character.​​​​
// '*' Matches zero or more of the preceding element.
// The matching should cover the entire input string (not partial).
public class isMatch {
    public static boolean isMatch (String s, String p) {
        return isMatch(s, p, '#'); 
    }
    private static boolean isMatch (String s, String p, char prev) {
        if (s.length() > 0 && p.length() == 0)
            return false;
        if (s.length() == 0)
            return true;
        if (s.charAt(0) != p.charAt(0)) {
            if (p.charAt(0) == '.')  // continue
                isMatch(s.substring(1), p.substring(1), p.charAt(0)); 

            else if (p.charAt(0) == '*' && (s.charAt(0) == prev || prev == '.'))// continue
                isMatch(s.substring(1), p.substring(1), p.charAt(0));

            else 
                return false;
        }
        return isMatch(s.substring(1), p.substring(1), p.charAt(0));

    }
    public static void main(String[] args) {
        System.out.println("For s = aa, p = a expected false; "+isMatch("aa", "a"));
        System.out.println("For s = aa, p = a* expected true; "+isMatch("aa", "a*"));
        System.out.println("For s = ab, p = .* expected true; "+isMatch("ab", ".*"));
        System.out.println("For s = aabbaabbaabb, p = a.b*a.b*a.b* expected true; "+isMatch("aabbaabbaabb", "a.b*a.b*a.b*"));
        System.out.println("For s = aabbaa, p = aa..a expected false; "+isMatch("aabbaa", "aa..a"));
        System.out.println("For s = aabbcc, p = a*b.c expected false; "+isMatch("aabbcc", "a*b.c"));
        System.out.println("For s = aabbcc, p = a*b.c.bda* expected true; "+isMatch("aabbcc", "a*b.c.bda*"));
    }
}