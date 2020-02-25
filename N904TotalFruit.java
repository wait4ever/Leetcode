package LeetCode;

public class N904TotalFruit {

    public static void main(String[] args) {
        totalFruit(new int[]{0,5,9,0,9,9,0,0,2,7});
    }

    static int totalFruit(int[] tree) {

        if(tree.length ==0) return 0;

        int res = 0;

        int left = 0;
        int count =1;

        int preIndex = -1; // 未初始化
        int preValue = -1; // 未初始化

        int value = tree[0];
        int index = 0;

        for(int i=1; i<tree.length;i++){
            if(tree[i] == value){
                continue;
            }
            else if(count<2){
                preIndex = index;
                preValue = value;
                index = i;
                value = tree[i];
                count++;
            }
            else if(tree[i]== preValue){
                preIndex = preIndex +1;
                preValue = value;
                index = i;
                value = tree[i];
            }
            else{
                preIndex = index;
                preValue = value;
                // 这里计算一下之前的窗口大小
                res = Math.max(i-left,res);
                System.out.println(res);
                left = preIndex;
                index = i;
                value = tree[i];
            }

        }
        res = Math.max(tree.length-left,res);
        return res;
    }
}
