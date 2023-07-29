import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int [] input = {1,1,1,2,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(input, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->y.first-x.first);
        
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.add(new Pair(e.getValue(), e.getKey()));
        }

        int [] ans = new int[k];

        while(k-->0){
            ans[k]=pq.poll().second;
        }
        return ans;
    }
}

class Pair{
    int first, second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
