package LeetCode;

public class N213RobII {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        // 不选第一个
        int[] ans1= new int[nums.length+1];
        for(int i=2;i<ans1.length;i++){
            ans1[i]= Math.max(ans1[i-2]+nums[i-1],ans1[i-1]);
        }
        //不选最后一个
        int[] ans2= new int[nums.length+1];
        for(int i=2;i<ans2.length;i++){
            ans2[i]= Math.max(ans2[i-2]+nums[i-2],ans2[i-1]);
        }

        return Math.max(ans1[ans1.length-1],ans2[ans2.length-1]);



    }
}
