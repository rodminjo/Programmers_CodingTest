package lv1.pre_exam;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1,2,3,4,5,1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        int max = 0;
        int length = 0;

        for (int i =0 ; i < answers.length; i++) {

            if (answers[i]== person1[i % 10]){
                count[0]++;
            }

            if (answers[i]== person2[i % 8]){
                count[1]++;
            }

            if (answers[i]== person3[i % 10]){
                count[2]++;
            }
        }

        for (int i : count){
            if(i > max){
                max =i;
            }
        }

        for(int i : count){
            if(i ==max){
                length++;
            }
        }
        int[] answer = new int[length];
        int c =0;
        for(int i = 0 ; i < 3 ; i++){
            if(count[i] ==max){
                answer[c++] = (i+1);
            }
        }

        return answer;
    }
}
