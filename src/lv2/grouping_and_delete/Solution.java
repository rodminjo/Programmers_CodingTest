package lv2.grouping_and_delete;

import java.util.Stack;

class Solution
{
    public int solution(String s) {

        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        stack.push('0');
        for (char c : charArr) {
            if (stack.peek() == c){
                stack.pop();
            } else{
                stack.push(c);
            }
        }

        if (stack.peek() == '0'){
            return 1;
        }else{
            return 0;
        }
    }
}
