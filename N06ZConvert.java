/*
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

L   C   I   R
E T O E S I I G
E   D   H   N

之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 */
package LeetCode;

public class N06ZConvert {
    public static void main(String[] args) {

        String s = "ABCDE";
        int numRows = 2;

        if(numRows==1){
            System.out.println(s);
            return;
        }

        final int BASENUM = (numRows-1)*2;
        int reverse= 0;
        int reverse2 = 0;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<numRows;i++){
            int j =i;
            reverse2 = reverse;
            if (reverse2==BASENUM){
                reverse2=0;
            }
            while(j<s.length()){
                sb.append(s.charAt(j));
                j = j + (BASENUM-reverse2);
                if(reverse2!=0 && reverse2!= BASENUM)
                    reverse2 = BASENUM-reverse2;

            }
            reverse=reverse+2;
        }

        System.out.println(sb.toString());


    }
}
