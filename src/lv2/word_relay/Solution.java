package lv2.word_relay;

//Set : 중복값 파악할때 사용해볼것

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        int breakCount = 0;

        loop :
        for (int i =1 ; i < words.length; i++) {
            // 끝말 이어지는지 파악
            if(words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1)){
                breakCount = i+1;
                break loop;
            }
            // 중복된 값이 있는지 파악
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    breakCount = i+1;
                    break loop;
                }
            }
        }

        // 번호 : 나머지 , 차례 : 몫 + 1
        if (breakCount == 0) {return answer;}

        if (breakCount % n ==0){
            answer[0] = n;
            answer[1] = breakCount/n;
        }else{
            answer[0] = breakCount%n;
            answer[1] = (breakCount / n)+1;
        }

        return answer;
    }
}
