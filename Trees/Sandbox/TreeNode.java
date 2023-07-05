package Sandbox;

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){}

    TreeNode(int val){
        this.val = val;
        this.right = this.left = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
    
}
