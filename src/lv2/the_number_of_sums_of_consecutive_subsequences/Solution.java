package lv2.the_number_of_sums_of_consecutive_subsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int q = 0; q < 2;q++) {
            for (int i : elements) {
                list.add(i);
            }
        }


        // 배열 크기
        for (int i = 1; i <elements.length+1; i++) {
            //시작위치
            for (int j = 0; j <= list.size()-i; j++) {
                int sum = 0;
                // 합
                for (int k =0 ; k < i ; k++) {
                    sum += list.get(j + k);
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}
