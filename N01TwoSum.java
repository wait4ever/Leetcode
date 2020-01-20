/*
1. 两数之和
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

示例:

给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
package LeetCode;
import java.util.HashMap;

public class N01TwoSum {
    public static void main(String[] args) {
        int[] nums= {2,7,11,15};
        int target = 22;
        int[] result=new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap();
        hashmap.put(nums[0],0);

        for(int i=1;i<nums.length;i++){
            if(hashmap.containsKey(target-nums[i])){
                result = new int[]{i,hashmap.get(target-nums[i])};
                break;
            }
            hashmap.put(nums[i],i);
        }
        // 输出结果
        System.out.print(result[0]+" ");
        System.out.println(result[1]);
    }
}
