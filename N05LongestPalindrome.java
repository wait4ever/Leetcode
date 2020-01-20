/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。

 */

package LeetCode;

public class N05LongestPalindrome {


    static int expandCenter(int left,int right,String s){

        while (left>=0 && right <s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;

    }
    public static void main(String[] args) {
        String s = "babad";

        int start=0;
        int end=0;

        // 空串
        if (s.length()==0){
            System.out.println("");
        }

        int max = 1;

        for(int i=1;i<s.length();i++){
            int len1 = expandCenter(i-1, i,s);
            int len2 = expandCenter(i-1,i+1,s);
            int len = Math.max(len1,len2);
            if (len > max){
                max = len;
                start = i - len/2;
                end = i + (len-1)/2;
            }
        }

        System.out.println(s.substring(start,end+1));
    }



}
