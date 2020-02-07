/*
给定一个非负整数数组，你最初位于数组的第一个位置。
数组中的每个元素代表你在该位置可以跳跃的最大长度。
判断你是否能够到达最后一个位置。
 */
package LeetCode;

public class N55CanJump {

    private static boolean canJump(int[] nums) {

        int size = nums.length;
        int i;
        int maxIndex = 0;
        for(i=0 ;i<=maxIndex;i++){

            if(maxIndex >= size-1){
                return true;
            }
            maxIndex = Math.max(maxIndex,i+nums[i]);
            if(maxIndex>=size-1){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
