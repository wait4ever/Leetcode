/*
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

示例 1:
输入: 121
输出: true
 */
package LeetCode;

public class N9IsPalindrome {
    //未完成
    public static void main(String[] args) {
        //但是这样有零的数字就出事了
        int x = 100002001;
        int div = 1;
        while(x/div>=10)
            div = div*10;
        while (x>9){
            int head = x/div;
            int tail = x%10;
            if(head!=tail){
                System.out.println("false");
                return;
            }
            x = (x%div)/10;
            div = div/100;

        }

        System.out.println("true");

    }
}
