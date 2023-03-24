package lv2.target_number;

// **알고리즘 DFS(깊이우선탐색) == 재귀함수 , BFS(넓이우선탐색) 공부해볼것

class Solution {

    int answer = 0;
    public int solution(int[] numbers, int target) {
        algo(numbers, target,0,0);

        return answer;
    }

    void algo(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (sum ==target){
                answer++;
            }
        }else {
            algo(numbers, target, depth+1, sum+numbers[depth]);
            algo(numbers, target, depth+1, sum-numbers[depth]);
        }

    }

}
