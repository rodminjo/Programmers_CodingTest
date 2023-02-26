package lv2.fibonacci_num;

// (A + B) % C ≡ ( ( A % C ) + ( B % C) ) % C
// 위 성질을 이용하여 각 연산마다 % 를 해줘 오버플로우가 안나게 함

class Solution {
    public int solution(int n) {
        int iter0 = 0, iter1 = 1, iter2 = 0;


        for (int i = 2; i <= n; i++) {
            iter2 = (iter0 + iter1) % 1234567;
            iter0 = iter1;
            iter1 = iter2;

        }


        return (iter2 % 1234567);
    }

//    재귀함수를 이용한 풀이
//    public long fibonacci(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }


}
