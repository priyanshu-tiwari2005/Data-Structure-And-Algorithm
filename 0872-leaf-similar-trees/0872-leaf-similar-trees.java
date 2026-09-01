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
    public void firstList(TreeNode root1 , List<Integer>list1){
        if(root1 == null){
            return;
        }
        if(root1.left == null && root1.right == null){
            list1.add(root1.val);
        }
        firstList(root1.left , list1);
        firstList(root1.right ,list1);
    } 
     public void secondList(TreeNode root2 , List<Integer>list2){
        if(root2 == null){
            return;
        }
        if(root2.left == null && root2.right == null){
            list2.add(root2.val);
        }
        firstList(root2.left , list2);
        firstList(root2.right ,list2);
    } 
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        firstList(root1 , list1);
        secondList(root2 , list2);

        if(list1.equals(list2)){
            return true;
        }else{
            return false;
        }

    }
}