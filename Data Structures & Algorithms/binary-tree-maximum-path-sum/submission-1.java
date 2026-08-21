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
    int maxPathSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculateMax(root);
        return maxPathSum;
    }
    public int calculateMax(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=Math.max(calculateMax(root.left),0);
        int right=Math.max(calculateMax(root.right),0);
        int currSum=left+right+root.val;
        maxPathSum=Math.max(currSum,maxPathSum);
        return root.val + Math.max(left,right);
    }
}