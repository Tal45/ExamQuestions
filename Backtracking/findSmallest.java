public class findSmallest {
    public static int findSmallest(int[] arr) {
        if (arr[0] > 1)
            return 1;
        int smallest = 1;
        int sum = 0;

        for (int i = 0; i < arr.length-1; i ++){
            sum+= arr[i];
            smallest = sum+1;
            if (smallest > sum && smallest < arr[i+1]) {
                return smallest;
            }
        }
        sum+=arr[arr.length-1];
        return sum+1;
    }

    public static void main (String[] args) {
        int[] a = {1,1,1,1};
        int[] a1 = {1,1,3,4};
        int[] a2 = {1,3,5,10,20,40};
        int[] a3 = {1,2,4,10,11,15};

        System.out.println("For {1,1,1,1}: "+findSmallest(a));
        System.out.println("For {1,1,3,4}: "+findSmallest(a1));
        System.out.println("For {1,3,5,10,20,40}: "+findSmallest(a2));
        System.out.println("For {1,2,4,10,11,15}: "+findSmallest(a3));

    }
}