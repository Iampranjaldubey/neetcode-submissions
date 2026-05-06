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
        List<Integer> arr=new ArrayList<>();
        inorder(arr, root);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }
        return true;
        
    }
    private void inorder(List<Integer> arr, TreeNode node){
        if(node==null) return;
        inorder(arr,node.left);
        arr.add(node.val);
        inorder(arr,node.right);
    }
}
