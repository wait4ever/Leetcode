package LeetCode;

public class N34SearchRange {
    static public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        if(right==0){
            return new int[]{-1,-1};
        }

        //查找左侧边界
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                right = mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        int leftIndex = right;

        if(leftIndex==nums.length){
            return new int[]{-1,-1};
        }
        if(nums[leftIndex]!=target){
            return new int[]{-1,-1};
        }

        left = 0;
        right = nums.length;

        while(left<right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                left = mid+1;
            }else if(nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }
        }

        int rightIndex = right-1;

        return new int[]{leftIndex,rightIndex};

    }

    public static void main(String[] args) {
        int[] ans = searchRange(new int[]{5,7,7,8,8,10},8);
        System.out.println(ans[0]+","+ans[1]);
    }
}
