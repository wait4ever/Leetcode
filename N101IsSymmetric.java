package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class N101IsSymmetric {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        boolean isContinue = true;
        while (!queue.isEmpty() && isContinue == true) {
            isContinue = false;
            LinkedList<Integer> oneLevel = new LinkedList();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode tn = queue.poll();
                if (tn != null) {
                    isContinue = true;
                }
                queue.add(tn.left);
                queue.add(tn.right);
                oneLevel.add(tn.val);
            }
            while (oneLevel.size() != 0) {
                if (oneLevel.pollFirst() != oneLevel.poll()) {
                    return false;
                }
            }


        }
        return true;
    }

    public static void main(String[] args) {

    }
}
