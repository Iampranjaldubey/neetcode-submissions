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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> curr_level=new ArrayList<>();

            for(int i = queue.size();i>0;i--){
                TreeNode curr_node=queue.poll();
                if(curr_node!=null){
                    curr_level.add(curr_node.val);
                    queue.add(curr_node.left);
                    queue.add(curr_node.right);
                }        
            }
            if(curr_level.size()> 0){
                result.add(curr_level);
            }
        }
        return result;       
    }
}
