import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> ans;
        String [] words = {"eat","atn","tea","tan","ate","nat","bat"};
        ans = groupAnagrams(words);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
