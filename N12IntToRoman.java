/*
给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。

字符          数值
I             1
IV            4
V             5
IX            9
X             10
XL            40
L             50
XC            90
C             100
CD            400
D             500
CM            900
M             1000

 */
package LeetCode;

public class N12IntToRoman {
    // 在所有 Java 提交中击败了 16.24%的用户
    // 改成数组，则速度提升。能不用Hashmap 就不要用。
    private static String solution1(int num){


//        HashMap hashMap = new HashMap();
//        hashMap.put(1,"I");
//        hashMap.put(4,"IV");
//        hashMap.put(5,"V");
//        hashMap.put(9,"IX");
//        hashMap.put(10,"X");
//        hashMap.put(40,"XL");
//        hashMap.put(50,"L");
//        hashMap.put(90,"XC");
//        hashMap.put(100,"C");
//        hashMap.put(400,"CD");
//        hashMap.put(500,"D");
//        hashMap.put(900,"CM");
//        hashMap.put(1000,"M");

        StringBuilder result = new StringBuilder("");

        int[] nums = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] label = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        for (int i =nums.length-1;i>=0;i--){
            while (num>0){
                if(num-nums[i]>=0){
                    num = num - nums[i];
                    result = result.append(label[i]);
                }else{
                    break;
                }
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        int num = 1994;
        System.out.println(solution1(1994));



    }
}
