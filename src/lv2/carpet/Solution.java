package lv2.carpet;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int area = brown + yellow;

        loop:
        for (int i =3 ; i < area ; i++){
            for (int j = 3 ; j <= i ; j++){
                if (i * j == area && (2*(i+j)- 4) == brown){
                    answer[0] = i;
                    answer[1] = j;
                    break loop;
                }
            }
        }

        return answer;
    }
}