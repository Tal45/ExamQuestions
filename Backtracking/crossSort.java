// 2012b 85
public class crossSort {
    // Time complexity O(n)
    public static void crossSort (int[] arr) {
        int low = 0;
        int high;
        if ((arr.length-1) % 2 == 0)
            high = arr.length-2;
        else
            high = arr.length-1;
        int[] tmp = new int[arr.length];

        for (int i = 0; i < tmp.length; i ++){
            if (low < arr.length && high >= 0) {
                if (arr[low] <= arr[high]) {
                    tmp[i] = arr[low];
                    low=low+2;
                }
                else {
                    tmp[i] = arr[high];
                    high = high - 2;
                }
            }
            else if (low >= arr.length) {
                tmp[i] = arr[high];
                high = high - 2;
            }
            else {
                tmp[i] = arr[low];
                low = low+2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tmp[i];
        }
    }
    // Time complexity O(log n)
    public static int crossSearch (int[] arr, int x) {
        int low = 0;
        int high, tmpHigh;
        
        if ((arr.length-1) % 2 == 0) {
            high = arr.length-1;
            tmpHigh = arr.length-2;
        }
        else {
            high = arr.length-2;
            tmpHigh = arr.length-1;
        }
        int mid;
        while (low <= high) {
            mid = (low+high) / 2;
            mid = (mid%2==0) ? mid : mid-1;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                high = mid-2;
            else
                low = mid+2;
        }
        
        high = 1;
        low = tmpHigh;
        
        while (high <= low) {
            mid = (low+high) / 2;
            mid = (mid%2==0) ? mid+1 : mid;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                high = mid+2;
            else
                low = mid-2;
        }
        return -1;
    }

    public static void main (String [] args) {
        int[] a = {1,9,2,8,4,7,7,4,12};
        System.out.println("before sort: ");
        printArr(a);
        System.out.println("find 7 index: "+crossSearch(a, 7));
        crossSort(a);
        System.out.println("after sort: ");
        printArr(a);

        int[] b = {1,15,3,12,5,9,8,5,9,4,12,3,15,1};
        System.out.println("before sort: ");
        printArr(b);
        System.out.println("find 9 index: "+crossSearch(b, 9));
        System.out.println("find 2 index: "+crossSearch(b, 2));
        crossSort(b);
        System.out.println("after sort: ");
        printArr(b);
    }

    public static void printArr(int[] a) {
        if (a.length == 0)
            return;
        System.out.print("|");
        for (int i = 0; i < a.length; i ++){
            System.out.print(" "+a[i]+" |");
        }
        System.out.print("\n\n");
    }
}