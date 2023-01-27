package lv1.choice_two_number_sum;

//hashSet 대신 TreeSet 사용해볼것

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> arrSet = new HashSet<>(Set.of());

        for(int i = 0; i < numbers.length - 1 ; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arrSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[arrSet.size()];
        Iterator<Integer> iterator = arrSet.iterator();
        int count = 0;
        while(iterator.hasNext()){
            answer[count++] = iterator.next();
        }
        Arrays.sort(answer);
        return answer;
    }
}
