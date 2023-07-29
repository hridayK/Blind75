import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate{

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {1,1,1,1,1,1,2,2,2,3,3,4,4,5};

        System.out.println(Arrays.toString(arr1));
        System.out.println("Contains Duplicate: " + containsDuplicate(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        System.out.println("Contains Duplicate: " + containsDuplicate(arr2));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return !(hs.size() == nums.length);
    }
}