package lv1.pushing_keypad;

class Solution {
    public String solution(int[] numbers, String hand) {
        char handInit = (char)(hand.charAt(0) -32);
        int[] row = {4,1,1,1,2,2,2,3,3,3,4,4};
        int[] col = {2,1,2,3,1,2,3,1,2,3,1,3};
        int curLeft = 10;
        int curRight = 11;
        StringBuilder answer = new StringBuilder();

        for(int number : numbers){
            if(number == 1||number == 4||number == 7){
                answer.append("L");
                curLeft = number;
            }else if(number == 3||number == 6||number == 9){
                answer.append("R");
                curRight = number;
            }else{
                int minusLeft = Math.abs(row[curLeft] - row[number]) + Math.abs(col[curLeft] - col[number]);
                int minusRight = Math.abs(row[curRight] - row[number]) + Math.abs(col[curRight] - col[number]);

                if(minusLeft > minusRight){
                    answer.append("R");
                    curRight = number;
                }else if(minusLeft < minusRight){
                    answer.append("L");
                    curLeft = number;
                }else{
                    answer.append(handInit);
                    if (handInit == 'R') {
                        curRight = number;
                    }else{
                        curLeft = number;
                    }
                }
            }

        }


        return answer.toString();
    }
}
