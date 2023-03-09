package lv2.h_index;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = new Integer[citations.length+1];
        arr[0] = 0;

        for (int i = 0; i < citations.length; i++) {
            arr[i+1] = citations[i];
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 1 ; i <= arr[0] ; i++) {
            int count = 0;
            for (int j =0 ; j < arr.length ; j++) {
                if (arr[j] >= i) count++;
            }

            if (count >= i) answer = i;
        }

        return answer;
    }
}
