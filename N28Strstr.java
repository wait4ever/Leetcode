package LeetCode;

public class N28Strstr {
    public int strStr(String haystack, String needle) {

        int size = needle.length();
        int[] prefix = new int[size];
        prefix[0] = 0;
        int j = 0;
        for(int i=1;i<size;){
            if(needle.charAt(i)==needle.charAt(j)){
                prefix[i] = j+1;
                i++;
                j++;
            }else{
                if(j!=0){
                    j = prefix[j-1];
                }else{
                    prefix[i]=0;
                    i++;
                }
            }
        }
        // 匹配
        int m=0;
        int n=0;
        while(m<haystack.length()){
            if(haystack.charAt(m)==needle.charAt(n)){
                m++;
                n++;
            }
            else{
                if(n==0){
                    m++;
                }else{
                    n = prefix[n-1];
                }
            }
            if(n==needle.length()){
                System.out.println(m);
                System.out.println(n);

                return m-n;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        N28Strstr test = new N28Strstr();
        test.strStr("hello","ll");
    }
}
