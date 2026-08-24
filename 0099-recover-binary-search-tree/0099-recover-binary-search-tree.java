class Solution {

    public void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public void updateTree(TreeNode root, List<Integer> list, int[] index) {
        if (root == null) {
            return;
        }

        updateTree(root.left, list, index);

        root.val = list.get(index[0]);
        index[0]++;

        updateTree(root.right, list, index);
    }

    public void recoverTree(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        // Step 1: Get inorder values
        inOrder(root, list);

        // Step 2: Sort values
        Collections.sort(list);

        // Step 3: Put sorted values back into tree
        int[] index = {0};
        updateTree(root, list, index);
    }
}