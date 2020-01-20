/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

解题思路，【滑动窗口】
 */
package LeetCode;

import java.util.HashSet;

public class N03LengthOfLongestSubstring {

    public static void main(String[] args) {

        String s = "bbb";
        int maxLen = 0;
        int front = 0;
        HashSet set = new HashSet();
        for(int i=0;i<s.length();i++){

            while (set.contains(s.charAt(i))){
                set.remove(s.charAt(front));
                front++;
            }
            set.add(s.charAt(i));
            maxLen = Math.max(maxLen,i-front+1);

        }
        System.out.println(maxLen);
    }
}
