package lv1.phoneketmon;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int leng = nums.length / 2;
        int answer = 0;
        Set<Integer> distinctPKM = new HashSet<>();

        for (int i : nums) {
            distinctPKM.add(i);
        }

        if (leng >= distinctPKM.size()){
            answer = distinctPKM.size();
        }else if (leng < distinctPKM.size()){
            answer = leng;
        }

        return answer;
    }
}
