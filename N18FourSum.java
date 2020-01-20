package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N18FourSum {
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List result = new ArrayList();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int l = j+1;
                int r = nums.length-1;
                while(l<r){
                    int sum = nums[i]+nums[j]+nums[l]+nums[r];

                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        while(l<r && nums[l]==nums[l+1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r-1]){
                            r--;
                        }
                        l++;
                        r--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else r--;
                }

                while(j<nums.length-2 && nums[j]==nums[j+1]){
                    j++;
                }
            }
            while(i<nums.length-3 && nums[i]==nums[i+1]){
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSum(nums,0));
    }


}
