/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode rhttps://assets.leetcode.com/uploads/2021/01/18/pathsum1.jpg$0ight;
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
    public boolean helper(TreeNode root, int targetSum,int MySum){
        if(root==null) return false;
        if(root.left==null&& root.right==null && MySum+root.val==targetSum)
        return true;
        boolean leftResult=helper(root.left,targetSum,MySum+root.val);
        boolean rightResult=helper(root.right,targetSum,MySum+root.val);
        return leftResult || rightResult;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int mySum=0;
        return helper(root,targetSum,mySum);
    }
}