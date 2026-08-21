class Solution {
    public void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public int[] findMode(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        inOrder(root, list);

        int count = 1;
        int maxCount = 0;

        for (int i = 0; i < list.size(); i++) {

            if (i > 0 && list.get(i).equals(list.get(i - 1))) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                ans.clear();
                ans.add(list.get(i));
            } 
            else if (count == maxCount) {
                ans.add(list.get(i));
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}