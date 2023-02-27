package lv2.next_big_number;

// Integer.bitCount(int) : 비트에 1 갯수 세어주는 메서드
// 위 메서드 사용시 더 편함
class Solution {
    public int solution(int n) {
        int answer = n;
        String s = Integer.toBinaryString(n);
        int countOne = 0, countOne2 = 0;

        for (int i =0 ; i < s.length(); i++) {
            countOne = s.charAt(i) == '1' ? countOne + 1 : countOne;
        }

        while(countOne != countOne2){
            countOne2 = 0;
            answer ++;
            String str = Integer.toBinaryString(answer);
            for (int i =0 ; i < str.length(); i++) {
                countOne2 = str.charAt(i) == '1' ? countOne2 + 1 : countOne2;
            }
        }

        return answer;


    }

    // 비트연산을 비교하며 계산하는 법(고민해보기)
//    public int nextBigNumber(int n) {
//        int postPattern = n & -n, smallPattern = ((n ^ (n + postPattern)) / postPattern) >> 2;
//        return n + postPattern | smallPattern;
//    }



}