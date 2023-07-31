public class MostWater {
    public static void main(String[] args) {
        int [] input1 = {1,8,6,2,5,4,8,3,7};
        int [] input2 = {1,1};
        System.out.println("Max Area: " + maxArea(input1));
        System.out.println("Max Area: " + maxArea(input2));
    }
    
    public static int maxArea(int[] height) {
        int left, right;
        left=0;
        right=height.length-1;
        int maxHeight = -1;

        while(left<right){
            if(height[left]<height[right]){
                if(maxHeight< height[left]*(right-left)){
                    maxHeight = height[left]*(right-left);
                }
                left++;
            }else if(height[left]>height[right]){
                if(maxHeight< height[right]*(right-left)){
                    maxHeight = height[right]*(right-left);
                }
                right--;
            }else{
                if(maxHeight< height[right]*(right-left)){
                    maxHeight = height[right]*(right-left);
                }
                if(left<height.length-1 && right>0){
                    if(height[left+1]<height[right-1]){
                        left++;
                    }else if(height[left+1]>height[right-1]){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }

        return maxHeight;
    }
}
