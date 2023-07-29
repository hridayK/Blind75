import java.lang.reflect.Array;
import java.util.*;

public class ValidAnagram {

    public static void main(String[] args) {
        String t11 = "nagaram";
        String t12 = "anagram";

        String t21 = "gravy";
        String t22 = "ragvy";

        String t31 = "kayak";
        String t32 = "yayahak";

        System.out.println(isAnagram(t11, t12));
        System.out.println(isAnagram(t21, t22));
        System.out.println(isAnagram(t31, t32));
    }

    public static boolean isAnagram(String s, String t) {
        char [] alphabet = new char[26];

        for(char c : s.toCharArray()){
            alphabet[c-'a']++;
        }

        for(char c:t.toCharArray()){
            alphabet[c-'a']--;
            if(alphabet[c-'a'] < 0){return false;}
        }

        for(int i=0;i<alphabet.length;i++){
            if(alphabet[i]!=0){
                return false;
            }
        }
        
        return true;
    }    
}
