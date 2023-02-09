package lv1.toycrane;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int m : moves){
            System.out.println(Arrays.toString(stack.toArray()));
            for (int i =0; i < board.length; i++) {
                if(board[i][m-1] != 0){
                    int toy = board[i][m-1];
                    board[i][m-1] = 0;

                    if(stack.peek() == toy){
                        stack.pop();
                        count+= 2;
                    } else{
                        stack.push(toy);
                    }
                    break;
                }
            }
        }

        return count;

    }
}
