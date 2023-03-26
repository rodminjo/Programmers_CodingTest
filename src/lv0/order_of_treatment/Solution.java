package lv0.order_of_treatment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> list = new ArrayList<>();
        for (int i : emergency) {
            list.add(i);
        }

        list.sort(Collections.reverseOrder());

        for (int i=0; i < list.size() ; i++) {
            for (int j=0; j < emergency.length; j++) {
                if (list.get(i)==emergency[j]){
                    answer[j] = i + 1;
                }
            }
        }

        return answer;
    }
}
