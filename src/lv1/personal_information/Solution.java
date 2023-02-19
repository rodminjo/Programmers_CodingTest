package lv1.personal_information;

import java.util.ArrayList;
import java.util.HashMap;

        // 1. privacies 배열 나누기
        // 2. 나눈 배열 시작기간에 약정별 유효기간 더하기
        // 3. 더한 달이 12 넘으면 연도로 올려서 계산
        // 4. int로 만들어 today랑 비교하고 판별해서 index 산출
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] contractMMDD = new int[privacies.length];
        int[] contractYY = new int[privacies.length];
        char[] contractType = new char[privacies.length];
        HashMap<Character, Integer> type = new HashMap<>();
        int todayYY = Integer.valueOf(today.substring(0,4));
        int todayMMDD = Integer.valueOf(today.substring(5,7)+today.substring(8));

        for (int i = 0; i < privacies.length; i++) {
            contractMMDD[i] = Integer.valueOf(privacies[i].substring(5, 7)+privacies[i].substring(8, 10));
            contractYY[i] = Integer.valueOf(privacies[i].substring(0,4));
            contractType[i] = privacies[i].charAt(11);
        }

        for(String t : terms) {
            type.put(t.charAt(0), Integer.valueOf(t.substring(2)));
        }

        for(int i = 0; i < contractMMDD.length; i++) {
            contractMMDD[i] += (type.get(contractType[i]) % 12) * 100;
            contractYY[i] += (type.get(contractType[i]) / 12);
            if(contractMMDD[i] > 1300) {
                contractYY[i] += contractMMDD[i] / 1200;
                contractMMDD[i] = contractMMDD[i] % 1200;
            }

            if (contractYY[i] < todayYY) {
                result.add(i+1);
            }else if(contractYY[i] == todayYY && contractMMDD[i] <= todayMMDD) {
                result.add(i+1);
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] =result.get(i);
        }

        return answer;
    }
}