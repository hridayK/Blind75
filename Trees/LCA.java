public class LCA {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6,
                                    new TreeNode(2, new TreeNode(0),
                                        new TreeNode(4, new TreeNode(3), 
                                        new TreeNode(5))), 
                                            new TreeNode(8, 
                                            new TreeNode(7), 
                                            new TreeNode(9)));

        TreeNode ans1 = lowestCommonAncestor(root, 
                            new TreeNode(2), 
                            new TreeNode(8));
        System.out.println(ans1==null);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null | root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left==null)
            return right;
        if(right==null)
            return left;
        else
            return root;
    }
}
