public class LeftLeavesSum {

    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root, false);
    }

    private int sum(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        return sum(node.left, true) + sum(node.right, false);
    }
}
