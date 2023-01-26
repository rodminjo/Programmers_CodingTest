package lv1.k_number;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int answer[] = new int[commands.length];
        int count = 0;

        for(int[] i : commands) {
            int[] innerArr = new int[i[1]-i[0]+1];

            for(int j = i[0]-1; j <= i[1]-1; j++){
                innerArr[j-i[0]+1] = array[j];
            }

            Arrays.sort(innerArr);
            answer[count]= innerArr[i[2]-1];
            count++;
        }
        return answer;
    }
}
