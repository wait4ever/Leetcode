/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:
输入: 121
输出: true
 */
package LeetCode;

public class N9IsPalindrome {
    private static boolean solution1(int x){

        if(x<0){
            return false;
        }

        int div = 1;
        while(x/div>=10)
            div = div*10;

        while (x>0){
            int head = x/div;  //取首位
            int tail = x%10;   //取末位
            if(head!=tail){
                return false;
            }
            x = (x%div)/10;
            div = div/100;

        }

        return true;

    }
    public static void main(String[] args) {


        // 尽管被求余运算后，0不会被保存，但是由于 21除了一个大于21的值，所以也可"看作该位为0"。
        System.out.println(solution1(1000021));


    }
}
