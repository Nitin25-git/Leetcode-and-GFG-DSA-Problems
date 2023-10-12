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
    public boolean isBalanced(TreeNode root) {
        
        if(root==null)
             return true;
       int ans=ishelper(root);
           if(ans==-1)
               return false;
        return true;
        
        
    }
    int ishelper(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int h1=ishelper(root.left);
        if(h1==-1)
            return -1;
        int h2=ishelper(root.right);
        if(h2==-1)
            return -1;
        if(Math.abs(h1-h2)>1)
            return -1;
         return Math.max(h1,h2)+1;
    }
}