/*
给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器，且 n 的值至少为 2。

思路： 面积为底和高决定，高又由短的边决定。因此从两边移动，每次移动短的边。
 */
package LeetCode;

public class N11MaxArea {
    public static void main(String[] args) {
        int[] height= new int[]{1,8,6,2,5,4,8,3,7};

        int left=0;
        int right=height.length-1;
        int max = 0;

        while(left<right){
            int leftSide = height[left];
            int rightSide = height[right];
            max = Math.max(max,(right-left)*Math.min(leftSide,rightSide));
            if(leftSide>rightSide)
                right--;
            else left++;
        }

        System.out.println("Max area is "+max);

    }

}
