package lv1.divisornumbersum;

class Solution {
    int result = 0;

    public int solution(int left, int right) {
        for(int i = left; i <= right; i++){
            int judge = 1;
            for(int j =1 ; j<=(i/2) ; j++){
                if(i % j ==0){
                    judge += 1;
                }
            }

            result += judge % 2 ==0 ? i : -i;
        }

        return result;
    }

    //어떤수가 제곱수이면 약수의 갯수는 홀수, 제곱수가 아니면 약수의 개수는 짝수
}
