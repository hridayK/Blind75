public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        try {
            TreeNode temp = invertTree(root.left);
            root.left = invertTree(root.right);
            root.right = temp;
        } catch (Exception e) {}
        return root;
    }
}
