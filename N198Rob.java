package LeetCode;

public class N198Rob {
    public int rob(int[] nums) {

        if(nums.length==0)
            return 0;

        int[] ans = new int[nums.length+2]; // 数组比原数组大2，前两个值设为0。

        // 边界检查

        for(int i=2;i<nums.length+2;i++){
            ans[i] = Math.max(ans[i-2]+nums[i-2],ans[i-1]);
        }
        return ans[nums.length+1];

    }
}
