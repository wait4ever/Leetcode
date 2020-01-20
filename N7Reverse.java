/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:
输入: 123
输出: 321

溢出输出 0
 */
package LeetCode;

public class N7Reverse {
    public static void main(String[] args) {
        int x = -123;

        // first version -- too slow.

//        String s = Integer.toString(x);
//        s = new StringBuilder(s).reverse().toString();
//        int result = 0;
//        if(x<0){
//            try {
//                result = Integer.valueOf(s.substring(0, s.length() - 1))*-1;
//            } catch (Exception e){
//
//            }
//
//        }else{
//            try {
//                result = Integer.valueOf(s);
//            } catch (Exception e){
//            }
//        }
//        System.out.println(result);

        // return result;

        // second version

        int pop;
        int ans = 0;

        while(x!=0){
            pop = x%10; //取末尾
            if(ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10 && pop>7))
                //return 0;
                System.out.println(0);
            if(ans<Integer.MIN_VALUE/10 || (ans ==Integer.MIN_VALUE/10 && pop<-8))
                // return 0
                System.out.println(0);
            ans = ans*10+pop;
            x = x/10;
        }

        System.out.println(ans);

    }
}
