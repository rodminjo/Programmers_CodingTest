package lv0.sum_continue_number;


class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for(int i = -333; i < 333; i++){
            if((num*i)+(num*(num-1))/2 == total){
                for(int j = 0 ;j < num; j++ ){
                    answer[j] = i + j;
                }
            }
        }

        return answer;
    }
}