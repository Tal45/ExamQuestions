// 2014a 85
// Time complexity O(log n)
public class findMax {
    public static int findMax(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int mid;
        
        while (low <= high) {
            mid = (low+high) / 2;
            if (mid == 0) {
                if (arr[mid] > arr[mid+1] && arr[mid] > arr[arr.length-1])
                    return mid;
            }
            else if (mid == arr.length-1) {
                if (arr[mid] > arr[0] && arr[mid] > arr[mid-1])
                    return mid;
            }
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) 
                return mid;
            else if (arr[mid] < arr[low]) 
                high = mid-1;
            else
                low = mid+1;
        }
        return 0; // dummy return
    }
    public static void main (String[] args) {
        int[] a = {65,70,-5,3,48,49,52};
        System.out.println("For {65,70,-5,3,48,49,52} max is: "+findMax(a));
        int[] b = {30,40,50,60,80,90,10,20};
        System.out.println("For {30,40,50,60,80,90,10,20} max is: "+findMax(b));
    }
}
