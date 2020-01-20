/*
给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.

与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */
package LeetCode;

import java.util.Arrays;

public class N16ThreeSumClosest {

    static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int sum=0;
        int div = Integer.MAX_VALUE;
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        }
        for(int i=0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sumOfNums = nums[i]+nums[l]+nums[r];
                if(sumOfNums==target){
                    return target;
                }
                if(Math.abs(sumOfNums-target)<div){
                    sum = sumOfNums;
                    div = Math.abs(sumOfNums-target);
                }
                if(sumOfNums>target){
                    r--;
                }else{
                    l++;
                }
            }

        }
        return sum;

    }

    public static void main(String[] args) {

        int[] nums={0,1,1,1};

        System.out.println(threeSumClosest(nums,-100));

    }
}
