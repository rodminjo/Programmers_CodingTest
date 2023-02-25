package lv2.expression_of_number;

// 더 쉬운방법
// 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다라는 정수론 정리가 있습니다.

class Solution {
    public int solution(int n) {
        int answer = 1;

        for(int i = n/2 + 1; i >0; i--) {
            int sum =0;
            for(int j = i; j > 0; j--) {
                sum += j;
                if(sum >= n){
                    break;
                }
            }
            if (sum ==n){
                answer ++;
            }

        }

        return answer;
    }
}
