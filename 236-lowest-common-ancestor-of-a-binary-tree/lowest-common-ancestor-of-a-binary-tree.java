/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val==p.val || root.val==q.val){
            return root;
        }
        TreeNode foundLeft=lowestCommonAncestor(root.left,p,q);
        TreeNode foundright=lowestCommonAncestor(root.right,p,q);
        if(foundLeft!=null && foundright !=null ){
            return root;
        }
        if(foundLeft==null){
            return foundright;
        }
        
        return foundLeft; 
    }
}