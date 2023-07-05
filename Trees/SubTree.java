public class SubTree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5, 
                                new TreeNode(2), 
                                new TreeNode(7, 
                                                    new TreeNode(6), 
                                                    new TreeNode(19)));

        TreeNode t2 = new TreeNode(1, null, 
                            new TreeNode(1, null, 
                                new TreeNode(1, null, 
                                    new TreeNode(1, null, 
                                        new TreeNode(1)))));
        // TreeNode t2 = new TreeNode(5, 
        //                         new TreeNode(2), 
        //                         new TreeNode(7, 
        //                                             new TreeNode(6), 
        //                                             new TreeNode(10)));
        
        // TreeNode t3 = new TreeNode(1, new TreeNode(2), 
        //                                 new TreeNode(3)
        //                                 );

        // TreeNode t4 = new TreeNode(1, new TreeNode(2), 
        //                                 new TreeNode(3)
        //                                 );

        TreeNode sub2 = new TreeNode(1, null, 
                                new TreeNode(1, null, 
                                    new TreeNode(1)));

        TreeNode sub1 = new TreeNode(7, new TreeNode(6), new TreeNode(19));
        System.out.println(isSubtree(t1, sub1));
        System.out.println(isSubtree(t2, sub2));
    }

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root == null || subRoot == null){
            return root == null && subRoot == null;
        }
        return (root.val == subRoot.val) && isIdentical(root.left, subRoot.left)
                    && isIdentical(root.right, subRoot.right);
    }
}
