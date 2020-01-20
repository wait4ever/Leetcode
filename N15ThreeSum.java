package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N15ThreeSum {
    static List<List<Integer>> solution(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){

            // 剪枝
            if(nums[i]>0){
                return result;
            }

            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                if(nums[left]+nums[right]+nums[i]==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // no break
                    while (left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while (left<right && nums[right]==nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }else if(nums[left]+nums[right]+nums[i]<0){
                    left++;
                }else right--;
            }
            while(i+1<nums.length && nums[i]==nums[i+1]){
                i++;
            }
        }

        return result;


    }

    // faster
    static List<List<Integer>> solution2(int[] nums){
        int L;
        int R;
        Arrays.sort(nums);
        ArrayList result= new ArrayList();
        if(nums.length<3)
            return result;
        for(int k = 0 ;k<nums.length-2;k++){
            if(nums[k]>0)
                return result;
            L = k+1;
            R = nums.length-1;
            while (true){
                if(nums[k]+nums[L]+nums[R]==0){
                    result.add(Arrays.asList(nums[k],nums[L],nums[R]));

                    while(L<R&&nums[L]==nums[L+1]){
                        L++;
                    }
                    while(L<R&&nums[R]==nums[R-1]){
                        R--;
                    }

                    L++;
                    R--;
                }
                else if(nums[k]+nums[L]+nums[R]>0){
                    R--;
                }else{
                    L++;
                }

                if(L>=R){
                    break;
                }
            }
            while(k<nums.length-2 && nums[k]==nums[k+1]){
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {0,0,0};
        System.out.println(solution2(nums));
    }
}
