package Sandbox;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String args[]){
        TreeNode t1 = new TreeNode(1, 
                                new TreeNode(2,
                                            new TreeNode(4),
                                            new TreeNode(5)), 
                                new TreeNode(3, 
                                                    new TreeNode(6), 
    
                                                    new TreeNode(7)));
        /*TreeNode t2 = new TreeNode(5, 
                                new TreeNode(2), 
                                new TreeNode(7, 
                                                    new TreeNode(6), 
                                                    new TreeNode(10)));

        TreeNode t3 = new TreeNode(1, new TreeNode(2), 
                                        new TreeNode(3)
                                        );

        TreeNode t4 = new TreeNode(1, new TreeNode(2), 
                                        new TreeNode(3)
                                        );
        */
        // System.out.println(max(t1));
        // System.out.println(min(t1));
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(1);
        queue.add(1);

        System.out.println(queue);

        int x = queue.remove();
        System.out.println(x);

        System.out.println(queue);
    }

    // public void levelOrder(TreeNode root){
    //     Queue<TreeNode> queue = new LinkedList<>();
    // }

    public static int max(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int min(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    public static int treeHeight(TreeNode root){
        if(root==null)
            return 0;
        return Math.max(treeHeight(root.left), treeHeight(root.right)) + 1;
    }

    public static void inOrder(TreeNode root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.println("data = " + root.val);
        inOrder(root.right);
    }

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }

        System.out.println("data = " + root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(TreeNode root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println("data = " + root.val);
    }
    
}
