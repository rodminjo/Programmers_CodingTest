package lv2.new_clustering;

import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int totalLength = 0;
        int intersectionLength = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();


        for (int i =0 ; i < str1.length()-1 ; i++) {
            String fragment = str1.substring(i, i+2);
            fragment = fragment.replaceAll("[^a-z]", "");
            if (fragment.length() ==2) {
                map1.put(fragment, map1.getOrDefault(fragment, 0) + 1);
            }
        }
        for (int i = 0 ; i < str2.length()-1 ; i++){
            String fragment = str2.substring(i, i+2);
            fragment = fragment.replaceAll("[^a-z]", "");
            if (fragment.length() ==2) {
                map2.put(fragment, map2.getOrDefault(fragment, 0) + 1);
            }
        }
        Set<String> set = map2.keySet();

        for (String str : set){
            if (map1.get(str) != null){
                int higherValue = map1.get(str) >= map2.get(str) ? map1.get(str) : map2.get(str);
                int lowerValue = map1.get(str) >= map2.get(str) ? map2.get(str) : map1.get(str);
                map1.put(str, higherValue);
                intersectionLength += lowerValue;
            }else{
                map1.put(str, map2.get(str));
            }
        }

        Iterator<Integer> iterator = map1.values().iterator();

        while (iterator.hasNext()) {
            totalLength += iterator.next();
        }

        if (totalLength == 0){
            return 65536;
        }
        return intersectionLength * 65536 / totalLength;
    }
}
