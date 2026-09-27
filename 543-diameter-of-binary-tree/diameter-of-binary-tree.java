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
        int dt;//diameter
        int ht;//height

        Info(int dt, int ht) {
            this.dt = dt;
            this.ht = ht;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
           return diameter(root).dt-1;
    }
     public static Info diameter(TreeNode root){
        if(root==null){
           return new Info(0,0);
         }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int lh=leftInfo.ht;
        int rh=rightInfo.ht;
        int height=Math.max(lh,rh)+1;
        int sd=(lh+rh)+1;
        int diameter=Math.max(sd,Math.max(leftInfo.dt,rightInfo.dt));
        return new Info(diameter, height);
         }
    }