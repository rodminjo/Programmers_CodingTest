package lv1.i_hate_same_number;

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<>(List.of(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arrList.add(arr[i]);
            }
        }
        int[] result = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);
        }

        return result;
    }
}
