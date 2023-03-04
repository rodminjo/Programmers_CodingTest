package lv2.expected_bracket;

class Solution {
    public int solution(int n, int a, int b)
    {
        int demoA = a;
        int maxRound =(int) (Math.log10((double) n)/Math.log10(2));
        int answer = 0;

        if (b<a){
            a = b;
            b= demoA;
        }

        while(answer <= maxRound) {
            if (a+1 ==b && a % 2 == 1) {
                answer++;
                break;
            }else if (b+1 ==a) {
                answer += 2;
                break;
            }else{
                answer ++;
            }

            a = a % 2 == 1 ? a / 2 + 1 : a / 2;
            b = b % 2 == 1 ? b / 2 + 1 : b / 2;

        }


        return answer;
    }
}
