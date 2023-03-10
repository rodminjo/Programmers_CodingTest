package lv2.explain_problem;

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] charArr=s.toCharArray();
        List<Character> arr = new ArrayList<>();

        for (char c : charArr) {
            arr.add(c);
        }

        for (int i = 0 ; i < arr.size() ; i++) {
            // 스택 생성
            Stack<Character> stack = new Stack<>();
            stack.push('0');

            // 판별
            for (char c : arr) {
                if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                }else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                }else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                }else {
                    stack.push(c);
                }
            }

            //판별
            if (stack.size() == 1) {
                answer++;
            }
            // ArrayList 갱신
            arr.add(arr.get(0));
            arr.remove(0);
        }

        return answer;
    }
}
