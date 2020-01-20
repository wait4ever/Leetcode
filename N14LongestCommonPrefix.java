package LeetCode;

public class N14LongestCommonPrefix {
    private static String solution(String[] strs){

        int num = strs.length;

        if (num ==0){
            return "";
        }

        for(int i=0;i<strs[0].length();i++){
            char k = strs[0].charAt(i);
            for (int j=1;j<strs.length;j++){
                if(i == strs[j].length() || strs[j].charAt(i)!=k ){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];


    }
    public static void main(String[] args) {
        String[] strs= {"","c","dcar"};
        System.out.println(solution(strs));



    }
}
