package lv2.printer;

import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        boolean checked = true;

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> maxList = new LinkedList<>();
        LinkedList<Integer> distinguishList = new LinkedList<>();
        for (int i=0 ; i < priorities.length ; i++) {
            list.add(priorities[i]);
            maxList.add(priorities[i]);
            distinguishList.add(i);
        }

        Queue<Integer> qu = list;
        Queue<Integer> distinguishQu = distinguishList;
        maxList.sort(Collections.reverseOrder());

        while(checked){
            if (qu.peek()>=maxList.get(0)){
                answer++;
                maxList.remove(0);
                qu.poll();
                if (distinguishQu.poll()==location){
                     checked = false;
                };
            }else {
                qu.offer(qu.poll());
                distinguishQu.offer(distinguishQu.poll());
            }

        }

        return answer;
    }

    // 생각을 다르게 해보자! location을 변경할 수 있음
    /*
    class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}
     */

}
