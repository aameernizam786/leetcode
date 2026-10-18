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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        if(root==null){
            return list1;
        }
        leftView(root , list1);
        return list1;
    }
    public void leftView(TreeNode root , List<Integer> list1){
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list2 = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr==null){
                 list1.add(list2.get(list2.size()-1));
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                list2.add(curr.val);
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
    }
}