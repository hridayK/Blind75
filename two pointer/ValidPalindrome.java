public class ValidPalindrome{
    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            if(s.charAt(right)!=s.charAt(left)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}