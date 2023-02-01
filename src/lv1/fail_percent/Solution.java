package lv1.fail_percent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// 실패율 : 도달했지만 클리어못한 플레이어수(해당 라운드 배열요소의 수) / 해당라운드와 같거나 큰 수의 갯수(전체 인원수 - 아래 라운드 도달수)
// 실패율이 높은 스테이지부터 desc
// 같으면 작은번호부터 desc
// 도달한 사람이 없으면 실패율 0
class Solution {
    public int[] solution(int N, int[] stages) {

        Double[] fail = new Double[N];
        List<Double> failList = new ArrayList<>();
        int[] result = new int[N];

        for(int i = 1; i <= N; i++) {
            int countChild = 0;
            int countParent = 0;

            for(int j : stages) {
                countChild += j == i ? 1 : 0;
                countParent += j>=i ? 1 : 0;
            }

            fail[i-1] = countParent==0 ? 0 : ((double) countChild / countParent);
        }

        for(double d : fail) {
            failList.add(d);
        }
        Arrays.sort(fail, Collections.reverseOrder());

        for (int i = 0; i < fail.length; i++){
            result[i] = failList.indexOf(fail[i])+1;
            failList.set(failList.indexOf(fail[i]), -1.0);
        }

        return result;
    }


}
