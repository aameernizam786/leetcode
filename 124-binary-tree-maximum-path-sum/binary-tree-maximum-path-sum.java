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
    public static class Info{
        int sum;
        int max;
        Info(int sum , int max){
            this.sum=sum;
            this.max=max;
        }
    }
    public int maxPathSum(TreeNode root) {
       return maxSum(root).max;
    }
    public Info maxSum(TreeNode root){
        if(root==null){
            return new Info(0,Integer.MIN_VALUE);
        }
        Info leftInfo = maxSum(root.left);
        Info rightInfo = maxSum(root.right);
       int sum=root.val + Math.max(0,Math.max(leftInfo.sum,rightInfo.sum));
       int currmax=root.val+Math.max(0,leftInfo.sum)+ Math.max(0,rightInfo.sum);
       int max=Math.max(currmax ,Math.max(leftInfo.max,rightInfo.max));
        return new Info(sum,max);
                                 
    }
    
}