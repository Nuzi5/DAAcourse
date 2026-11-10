import java.util.ArrayList;
import java.util.List;

public class TreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            collect(root, "", paths);
        }
        return paths;
    }

    private void collect(TreeNode node, String prefix, List<String> paths) {
        String current = prefix.isEmpty() ? String.valueOf(node.val) : prefix + "->" + node.val;
        if (node.left == null && node.right == null) {
            paths.add(current);
            return;
        }
        if (node.left != null) {
            collect(node.left, current, paths);
        }
        if (node.right != null) {
            collect(node.right, current, paths);
        }
    }
}
