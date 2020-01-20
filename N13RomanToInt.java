/*
给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
package LeetCode;

public class N13RomanToInt {
    static int romanToInt(String s) {
        int result = 0;
        int[] nums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] label = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int i = label.length-1;

        while(true){

            // 由于两个字符的罗马数字只会出现一次，所以用if判断，且之后直接continue。
            if (s.length()>1 && s.substring(0,2).equals(label[i])){
                s = s.substring(2);
                result += nums[i];
                if("".equals(s)){
                    return result;
                }
                i--;
                continue;
            }

            while (s.substring(0,1).equals(label[i])){
                s = s.substring(1);
                result += nums[i];
                if("".equals(s)){
                    return result;
                }
            }
            i--;
        }
    }
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));



    }
}
