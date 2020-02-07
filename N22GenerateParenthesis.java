/*
给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。

例如，给出 n = 3，生成结果为：

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class N22GenerateParenthesis {

    private static List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();
        traceBack(ans,0,0,"",n);
        return ans;

    }

    static void traceBack(List ans,int l,int r,String s,int n){

        if(s.length()==n*2){
            ans.add(s);
        }
        if(l<n){
            traceBack(ans,l+1,r,s+"(",n);
        }
        // 右括号比左括号多，直接返回。
        if(r<l){
            traceBack(ans,l,r+1,s+")",n);
        }
    }
    public static void main(String[] args) {
        

        List<String> l = generateParenthesis(3);
        for (String s:l) {
            System.out.println(s);

        }
    }
}
