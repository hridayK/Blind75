public class SameTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5, 
                                new TreeNode(2), 
                                new TreeNode(7, 
                                                    new TreeNode(6), 
                                                    new TreeNode(19)));
        TreeNode t2 = new TreeNode(5, 
                                new TreeNode(2), 
                                new TreeNode(7, 
                                                    new TreeNode(6), 
                                                    new TreeNode(19)));

        TreeNode t3 = new TreeNode(1, new TreeNode(2), 
                                        new TreeNode(3)
                                        );

        TreeNode t4 = new TreeNode(1, new TreeNode(2), 
                                        new TreeNode(3)
                                        );

        System.out.println(isSameTree(t3, t4));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return p==q;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
