import java.util.*;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] arr1 = {100,4,200,2,3,1};
        int [] arr2 = {0,3,7,2,5,8,4,6,0,1};

        System.out.println(longestConsecutive(arr1));
        System.out.println(longestConsecutive(arr2));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }

        Arrays.sort(nums);

        int max = 0;
        int count = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            count++;
            if(nums[i]+1!=nums[i+1]){
                if(max<count){
                    max = count;
                }
                count=0;
            }
        }
        return Math.max(max, count+1);
    }
}
