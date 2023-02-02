package lv0.most_frequency_value;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int maxKey =0;
        int maxValues = 0;
        int count = 0;
        int answer = 0;
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int ar : array) {
            int num = 0;
            try {
                num = hashmap.get(ar) + 1;
            } catch(NullPointerException e) {
                num = 1;
            }
            hashmap.put(ar, num);
        }
        for (Map.Entry<Integer,Integer> entry : hashmap.entrySet()) {
            if (maxValues <= entry.getValue()){
                maxValues = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        for (int i : hashmap.values()) {
            count += maxValues == i ? 1 : 0;
        }

        if (count > 1) {
            answer = -1;
        } else {
            answer = maxKey;
        }

        return answer;
    }
}
