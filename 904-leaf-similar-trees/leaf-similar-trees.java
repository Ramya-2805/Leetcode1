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
    public void helper(TreeNode root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(root.val);
            
        }
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
        helper(root1,ans1);
        helper(root2,ans2);
        return ans1.equals(ans2);
    }
}