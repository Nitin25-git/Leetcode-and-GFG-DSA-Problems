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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
         
        boolean small1= isSameTree(p.left,q.left);
     boolean small2= isSameTree(p.right,q.right);

        if(small1 && small2)
        {
            if(p.val==q.val)
                return true;
        }
        return false;
        
    }
}