/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

 */
package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class N20IsValid {

    private static boolean isValid(String s) {

        HashMap<Character,Character> hashMap =  new HashMap();
        hashMap.put('[',']');
        hashMap.put('(',')');
        hashMap.put('{','}');
        Stack<Character> stack = new Stack();

        for (int i=0;i<s.length();i++){
            if (hashMap.containsValue(s.charAt(i))){
                if (stack.size()==0 || !(hashMap.get(stack.pop())==s.charAt(i))){
                    return false;
                }
            }
            else
                stack.push(s.charAt(i));
        }
        if (stack.size()==0){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        String s = "()[]{}]";
        System.out.println(isValid(s));


    }
}
