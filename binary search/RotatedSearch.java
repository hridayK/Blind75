import java.util.*;

public class RotatedSearch {
    public static void main(String[] args) {
        int [] nums = {4,5,6,7,0,1,2};
        int [] nums1 = {4,5,6,7,0,1,2};

        System.out.println(search(nums,3));
    }

    public static int search(int nums[], int target){
        int ans = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans = i;
                break;
            }
        }
        return ans;
    }
}
