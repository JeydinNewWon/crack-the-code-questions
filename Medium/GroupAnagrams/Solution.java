package Medium.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hMap = new HashMap<>();

        for (String s : strs) {
            String aSorted = anagramSort(s);
            if (hMap.containsKey(aSorted)) {
                hMap.get(aSorted).add(s);
            } else {
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                hMap.put(aSorted, stringList);
            }
        }

        return new ArrayList<>(hMap.values());
    }

    public String anagramSort(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);

        return String.valueOf(charArr);
    }
}
