/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

 */
package LeetCode;

public class N53MaxSubArray {

    public int maxSubArray(int[] nums) {


        int addUp=0;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            addUp += nums[i];
            ans = Math.max(ans,addUp);
            if(addUp<0){
                addUp = 0;
            }
        }
        return ans;
    }

}
