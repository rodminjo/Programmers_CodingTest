package lv2.right_bracket;

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        stack.push('f');

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }else {
                if (stack.peek() == '(') {
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        answer  = stack.peek() =='f' ? true : false;

        return answer;
    }
}
