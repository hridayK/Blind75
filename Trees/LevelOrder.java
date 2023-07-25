import java.util.*;

public class LevelOrder{
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3, new TreeNode(9),
                                            new TreeNode(20, 
                                                new TreeNode(15), 
                                                new TreeNode(7)));
        System.out.println(levelOrder(tree));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levels = queue.size();
            List<Integer> subLevel = new ArrayList<>();
            for(int i=0;i<levels;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                subLevel.add(queue.remove().val);
            }
            ans.add(subLevel);
        }
        return ans;
    }
}