package lv2.citrus_choice;

import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int compareQuantity = 0;

        for (int i : tangerine){
           int count=0;
           if (map.containsKey(i)){
               count = map.get(i);
           }
           map.put(i, ++count);
        }

        List<Map.Entry<Integer, Integer>> listEntry = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(listEntry, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : listEntry){
            answer ++;
            compareQuantity += entry.getValue();
            if (compareQuantity>=k){
                break;
            }
        }

        return answer;
    }
}
