package lv2.camouflage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0)+1);
        }

        Iterator<Integer> iterator = map.values().iterator();

        while (iterator.hasNext()) {
            answer *= (iterator.next()+1);
        }

        return answer - 1;
    }
}
