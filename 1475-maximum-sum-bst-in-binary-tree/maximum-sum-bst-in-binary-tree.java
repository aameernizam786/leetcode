/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static class Info {

        boolean isBst;
        int max;
        int min;
        int sum;

        Info(boolean isBst, int max, int min, int sum) {

            this.isBst = isBst;
            this.max = max;
            this.min = min;
            this.sum = sum;
        }
    }

    int max_Sum = 0;

    public int maxSumBST(TreeNode root) {

        max_Sum=0;
        maxSum(root);
        return max_Sum;

    }

    public Info maxSum(TreeNode root) {

        if (root == null) {
            return new Info(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }

        Info leftInfo = maxSum(root.left);
        Info rightInfo = maxSum(root.right);

        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));
        int min = Math.min(root.val, Math.min(leftInfo.min, rightInfo.min));
        int sum = leftInfo.sum + rightInfo.sum + root.val;

        if (!leftInfo.isBst || !rightInfo.isBst ||root.val <= leftInfo.max || root.val >= rightInfo.min) {
            return new Info(false, max, min, sum);
        }
        max_Sum=Math.max(max_Sum,sum);
        return new Info(true, max, min, sum);
    }
}