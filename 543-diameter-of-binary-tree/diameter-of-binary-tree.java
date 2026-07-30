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
    int dia=0;
    public int diameterOfBinaryTree(TreeNode root) {
    Length(root);

        return dia;
    }
     public int Length(TreeNode root) {
         if(root==null){
            return 0;
         }
         int left=Length(root.left);
         int right=Length(root.right);
         int cur=left+right;
         dia =Math.max(dia,cur);

         return 1+Math.max(left,right);
     }

}