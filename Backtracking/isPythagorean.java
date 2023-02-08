public class isPythagorean  {
    public static boolean isPythagorean(int[] arr) {
        int a, b, c;
        int abSq, cSq;
        
        for (c = arr.length-1; c > 1; c--) {
            cSq = (int) Math.pow(arr[c], 2);
            a = 0;
            b = c-1;
            while (a < b) {
                abSq = (int) Math.pow(arr[a],2) + (int) Math.pow(arr[b],2);
                if (abSq == cSq)
                    return true;
                else if (abSq > cSq)
                    b--;
                else
                    a++;
            }
        }
        return false;
    }
    public static void main (String[] args) {
        int[] a = {1,3,4,5,6};
        System.out.println(isPythagorean(a));
        int[] b = {4,5,6,12,13};
        System.out.println(isPythagorean(b));
    }
}