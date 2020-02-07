package LeetCode;

public class N29Divide {

    private static int divide(int dividend, int divisor) {

        int flag = ((dividend>0&&divisor>0)||(dividend<0 && divisor<0))?1:-1;

        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);


        if(dividend<divisor)
            return 0;

        int sum = 0;
        int count = 0;
        while(sum<=dividend-divisor){
            sum += divisor;
            count ++;
        }
        return count*flag;
    }

    public static void main(String[] args) {
        int dividend = -2147483647;
        int divisor = 1;

        divide(dividend,divisor);

    }
}
