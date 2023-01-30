public class calc {
    public static int calc (int num, int result, int maxOp) {
        return calc(num,result,maxOp, " "+num, num);
    }
    private static int calc (int num, int result, int maxOp, String p, int sum) {
        if (maxOp < 0) 
            return 0;
        if (sum > result)
            return 0;
        if (result == sum) {
            System.out.println(p+" = "+sum);
            return 1;
        }
        int try1 = calc(num,result,maxOp-1, p+"+"+num, sum+num);
        int try2 = calc(num,result,maxOp-1, p+"-"+num, sum-num);
        int try3 = calc(num,result,maxOp-1, p+"*"+num, sum*num);
        int try4 = calc(num,result,maxOp-1, p+"/"+num, sum/num);
        
        return try1 + try2 + try3 + try4;
    }
    public static void main(String [] args) {
        System.out.println("For calc(3,36,4): "+calc(3,36,4));
        
    }
}