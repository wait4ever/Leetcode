package LeetCode;

// 使用二分查找法查找旋转排序数组最小值的下标
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {8,9,2,3,4};
        int target =9;

        if(nums.length==0){
            System.out.println(-1);
            return;
        }
        if(nums.length==1){
            System.out.println((nums[0]==target)?0:-1);
            return;
        }

        int left = 0;
        int right = nums.length-1;
        int rotateIndex = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if(mid+1<nums.length && nums[mid]>nums[mid+1]){
                rotateIndex = mid+1;
                break;
            }else{
                if(nums[mid]>=nums[0]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        System.out.println("Rotate Index: "+rotateIndex);

        if(target>nums[0] && rotateIndex!=0){
            // 左边查
            left = 0;
            right = rotateIndex-1;
        }else if(target == nums[0]){
            System.out.println("final result: "+0);
            return;
        }else{
            // 往右差
            left = rotateIndex;
            right = nums.length-1;
        }

        // 开始二分查找，递增
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                System.out.println("final result: "+mid);
                return;
            }else if (target>nums[mid]){
                left = mid+1;
            }else {
                right =mid-1;
            }
        }
        System.out.println("finalIndex: "+ (-1));

    }
}
