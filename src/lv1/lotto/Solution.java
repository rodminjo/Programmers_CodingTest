package lv1.lotto;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count =0;
        int zeroCount = 0;

        for(int lo : lottos){
            if (lo == 0){ zeroCount++; }
            else{
                for(int win : win_nums){
                    if (win == lo){ count++; break;}
                }
            }
        }

        int lowLank = (7 - count);
        int highLank = (lowLank - zeroCount);


        if (lowLank== 7){ lowLank = 6; } else if (lowLank==0){ lowLank = 1; }
        if(highLank== 7){ highLank = 6; } else if (highLank==0){ highLank = 1; }

        int[] answer = {highLank, lowLank};
        return answer;
    }
}
