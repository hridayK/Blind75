public class MinRotatedArray{
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4,5,6,7};

        int [] t1 = {4,5,6,7,-11,0,1,2,3};
        System.out.println(findMin(nums));
    }

    public static int findMin(int[] nums) {
        int minValue = nums[0];
        if(nums.length==1){
            return minValue;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minValue){
                minValue = nums[i];
            }
        }
        return minValue;
    }
}