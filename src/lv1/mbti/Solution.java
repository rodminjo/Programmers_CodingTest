package lv1.mbti;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> hashMap = new HashMap<>(Map.of('R',0,'T',0,'C',0,'F',0,'J',0,'M',0,'A',0,'N',0));
        char[] mbti = {'R','T','C','F','J','M','A','N'};
        String answer = "";

        for(int i = 0; i < survey.length; i++) {
            int originalScore = 0;
            if(choices[i] <= 3){
                originalScore = hashMap.get(survey[i].charAt(0));
                hashMap.put(survey[i].charAt(0) ,originalScore + 4 - choices[i]);
            }else if(choices[i] >= 4){
                originalScore = hashMap.get(survey[i].charAt(1));
                hashMap.put(survey[i].charAt(1),originalScore + choices[i] - 4);
            }
        }

        for(int i = 0; i < mbti.length; i +=2 ) {
            if (hashMap.get(mbti[i])>=hashMap.get(mbti[i+1])){
                answer += mbti[i];
            } else{
                answer += mbti[i+1];
            }
        }
        return answer;
    }
}
