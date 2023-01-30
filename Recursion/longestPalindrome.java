public class longestPalindrome {
    public static int longestPalindrome(int[] arr) {
        return longestPalindrome(arr, 0, 1, 1);
    }
    public static int longestPalindrome(int[] arr, int i, int j, int longest) {
        if (i>=arr.length || i < 0 || j < 0 || j >= arr.length) {
            return longest;
        }
        int try1 = 0, try2= 0, try3=0;
        if (arr[i] == arr[j]) {
             try2 = longestPalindrome(arr, i-1, j+1, j-i+1);
             try3 = longestPalindrome(arr, i+2,j+1, longest); // continue forward to look for another palindrome
        }
        else {
             try1 = longestPalindrome(arr, i+1, j+1, longest);
        }
        
        return Math.max(try1, Math.max(try2,try3));
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3 ,10, 10 ,3 ,2 ,4};
        System.out.println("\nFor {1, 3, 2, 3 ,10, 10 ,3 ,2 ,4}:");
        System.out.println(longestPalindrome(arr));
        int[] arr2 = {2,3,4,5,6,6,4,5,2};
        System.out.println("\nFor {2,3,4,5,6,6,4,5,2}:");
        System.out.println(longestPalindrome(arr2));
        int[] arr3 = {2,3,4,5,6,3,4,5,2};
        System.out.println("\nFor {2,3,4,5,6,3,4,5,2}:");
        System.out.println(longestPalindrome(arr3));
        int[] arr4 = {1,2,3,4,4,3,2,1,4,5,6,7,8,9,10,10,9,8,7,6,5,4};
        System.out.println("\nFor {1,2,3,4,4,3,2,1,4,5,6,7,8,9,10,10,9,8,7,6,5,4}:");
        System.out.println(longestPalindrome(arr4));
    }
}