import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])!=i){
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                break;
            }
            map.put(target-nums[i], i);
        }

        return ans;
    }
    
}
