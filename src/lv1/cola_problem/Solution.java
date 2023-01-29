package lv1.cola_problem;

// n이 a로 떨어지는지 확인
// 떨어지면 나누고 b * 몫 리턴, 아니면 나머지와 b * 몫 리턴
// a 미만이면 총 콜라 갯수 리턴
// return (n > b ? n - b : 0) / (a - b) * b; - 한문장으로 출력됨. 고민해보기
class Solution {
    public int solution(int a, int b, int n) {
        int newCola = ((n / a)* b);
        int emptyCola = ((n / a)* b) + (n%a);

        while (emptyCola >= a){
            newCola += ((emptyCola / a)* b);
            emptyCola = ((emptyCola / a)* b) + (emptyCola % a);
        }

        return newCola;
    }
}
