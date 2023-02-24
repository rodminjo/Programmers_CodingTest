package lv2.binary_convert_repeat;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int zeroCount=0;

        while (s.length()!=1) {
            zeroCount = 0;
            for (int i =0 ; i < s.length(); i++) {
                if (s.charAt(i) =='0'){
                    zeroCount++;
                }
            }

            s= Integer.toBinaryString(s.length() -zeroCount);

            answer[0] ++;
            answer[1] += zeroCount;
        }

        return answer;
    }
}