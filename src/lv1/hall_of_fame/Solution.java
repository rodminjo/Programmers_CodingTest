package lv1.hall_of_fame;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int[] solution(int k, int[] score) {
        int dayLength = score.length;
        int[] result = new int[dayLength];
        Queue<Integer> HOF = new PriorityQueue<>();
        int count =0;

        for(int i : score){
            if(count < k){
                HOF.add(i);
            } else{
                HOF.add(i);
                HOF.poll();
            }

            result[count]=HOF.peek();
            count++;
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
