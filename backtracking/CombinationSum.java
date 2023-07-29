import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum{
    public static void main(String[] args) {
        int [] arr = {2,3,6,7};
        List<List<Integer>> ans = combinationSum(arr, 7);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }

    public static void backTrack(List<List<Integer>> result, LinkedList<Integer> lst, 
                                int idx, int [] candidates, int sum){
        if(sum==0){
            System.out.println(lst);
            result.add(new ArrayList<>(lst));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(sum-candidates[i]>=0){
                lst.add(candidates[i]);
                backTrack(result, lst, i, candidates, sum-candidates[i]);
                lst.removeLast();
            }
        }

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> lst = new LinkedList<>();
        backTrack(result, lst, 0, candidates, target);
        return result;
    }
}