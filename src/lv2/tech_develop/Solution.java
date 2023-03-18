package lv2.tech_develop;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int index = 0;
        int count = 0;
        int day = 1;
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < progresses.length; i++) {
        queue.add(progresses[i]);
        }

        while (!queue.isEmpty()) {
            if (queue.peek() + (day * speeds[index])>=100){
                queue.poll();
                index++;
                count++;
            }else{
                if (count !=0){
                    list.add(count);
                    count = 0;
                }
                day++;
            }
        }
        list.add(count);

        int[] answer = new int[list.size()];

        for (int i =0 ; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
