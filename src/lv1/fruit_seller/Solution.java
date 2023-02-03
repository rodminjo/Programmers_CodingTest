package lv1.fruit_seller;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int leng = score.length;
        int lastIndex = leng - (leng % m);
        Integer[] arr = new Integer[leng];

        // 배열 내림차순 정렬
        for(int i=0 ; i < leng ; i++){
            arr[i] = score[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int c = m-1; c < lastIndex; c+=m){
            answer += arr[c];
        }
        answer *= m;

        return answer;
    }
}
