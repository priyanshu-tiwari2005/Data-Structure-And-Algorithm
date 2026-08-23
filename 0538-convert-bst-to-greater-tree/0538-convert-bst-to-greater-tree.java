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
    public void inOrder(TreeNode root , List<TreeNode>list ){
        if(root == null){
            return;
        }
        inOrder(root.left , list );
        list.add(root);
        inOrder(root.right , list);
    }
    public TreeNode convertBST(TreeNode root) {
        List<TreeNode>list = new ArrayList<>();
        inOrder(root , list);
        
        
        int n = list.size();
        // int ans[] = new int [list.size()];
        // ans[n-1] = list.get(n-1);
       
        for(int i = n - 2 ; i>=0 ; i--){
           list.get(i).val += list.get(i+1).val;
        }
        return root;

    }
}