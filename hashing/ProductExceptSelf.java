import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int [] input1 = {1,2,3,4};
        int [] input2 = {-1,-1,0,3,-3};

        System.out.println(Arrays.toString(productExceptSelf(input1)));
        System.out.println(Arrays.toString(productExceptSelf(input2)));
    }

    public static int[] productExceptSelf(int[] nums) {
            boolean containsZero = false;
            int zeroCount = 0;
            int product = 1;
            for(int x:nums){
                if(x==0){
                    containsZero=true;
                    zeroCount++;
                    continue;
                }else{
                    product*=x;
                }
            }

            for(int i=0;i<nums.length;i++){
                if(containsZero){
                    if(nums[i]==0 && zeroCount==1){
                        nums[i]=product;
                    }else{
                        nums[i]=0;
                    }
                }else{
                    nums[i]=product/nums[i];
                }
            }
            return nums;
    }
}
