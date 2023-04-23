package lv2.fatigue;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        Arrays.sort(dungeons, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] - o2[0])*10+(o2[1]-o1[1]);
            }
        });

        for (int[] a : dungeons) {
            if (k>=a[0]){
                k -= a[1];
                answer++;
            }
        }


        return answer;
    }
}
