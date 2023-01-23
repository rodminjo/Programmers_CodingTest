package lv1.budget;

//  조건 : 많은 조합 중 가장 예산에 가까운 합을 구하고 부서 갯수를 출력
// 1. 정렬
// 2. 반복문을 이용하여 정렬한 행렬을 합하고 예산과 비교
// 3. 갯수를 출력

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        int count = 0;

        Arrays.sort(d);
        for(int i =0 ; i < d.length; i++) {
            sum += d[i];
            if (sum > budget) {
                break;
            }
            count++;

        }

        return count;
    }

}
