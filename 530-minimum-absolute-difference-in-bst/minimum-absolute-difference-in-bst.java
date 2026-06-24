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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> al=new ArrayList<>();
        inorder(root,al);
        int mini=Integer.MAX_VALUE;
        int n=al.size();
        for(int i=0;i<n-1;i++){
            mini=Math.min(mini,al.get(i+1)-al.get(i));
        }
        return mini;
    }
    public void inorder(TreeNode root,ArrayList<Integer>ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}