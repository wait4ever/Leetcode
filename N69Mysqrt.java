package LeetCode;

public class N69Mysqrt {
    public static void main(String[] args) {
        int x =789;
        if(x==0) System.out.println(0);

        long left = 0;
        long right = x;

        while(left<=right){
            long mid = (left+right)/2;
            if(mid*mid <= x & (mid+1)*(mid+1)>x){
                System.out.println(mid); //转为int return (int)mid;
                return;
            }
            else if(mid*mid > x) right=mid-1;
            else left= mid+1;
        }
        System.out.println("不会到这");;
    }
}
