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
    public boolean isValidBST(TreeNode root) {
        return check(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public static boolean check(TreeNode root, long max_val, long min_val){
        if(root == null) return true;
        if(root.val>=max_val || root.val<=min_val) return false;
        return check(root.left, root.val, min_val) && check(root.right, max_val, root.val);
    }
}