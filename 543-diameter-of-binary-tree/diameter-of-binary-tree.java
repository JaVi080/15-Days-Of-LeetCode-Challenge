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
      int maxDiameter=0;
       int height(TreeNode node){
        if(node==null)
            return 0;
        int left_h=height(node.left);
        int right_h=height(node.right);
        maxDiameter=Math.max(maxDiameter,right_h+left_h);
        return Math.max(left_h,right_h)+1;
    }
 public int diameterOfBinaryTree(TreeNode root) {
    maxDiameter=0;
       height(root);
        return maxDiameter;
    }
}