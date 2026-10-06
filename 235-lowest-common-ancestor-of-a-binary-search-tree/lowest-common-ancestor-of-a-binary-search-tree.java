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
        ArrayList<TreeNode> path1 = new ArrayList<>();
        ArrayList<TreeNode> path2 = new ArrayList<>();
        getpath(root,p,path1);
        getpath(root,q,path2);
        int i=0;
        for(;i<path1.size() && i<path2.size() ;i++){
            if((path1.get(i)).val != (path2.get(i)).val){
                break;
            }
        }
            return path1.get(i-1);
 }
    public boolean getpath(TreeNode root ,TreeNode p , ArrayList<TreeNode> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.val==p.val){
            return true;
        }
       boolean leftLca= getpath(root.left,p,path);
       boolean rightLca= getpath(root.right,p,path);
       if(leftLca||rightLca){
        return true;
       }
         path.remove(path.size()-1);
         return false;
    }
}