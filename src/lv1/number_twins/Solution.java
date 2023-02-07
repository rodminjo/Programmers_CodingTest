package lv1.number_twins;

import java.util.Map;
import java.util.TreeMap;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<Integer,Integer> mapX = new TreeMap<>();
        Map<Integer,Integer> mapY = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            mapX.put(i,0);
            mapY.put(i,0);
        }

        String[] splitX = X.split("");
        String[] splitY = Y.split("");

        for(String s : splitX) {
            Integer i = Integer.valueOf(s);
            mapX.put(i, mapX.get(i)+1);
        }

        for(String s : splitY) {
            Integer i = Integer.valueOf(s);
            mapY.put(i, mapY.get(i)+1);
        }

        for(int i = 0; i < 10 ; i++){
            if (mapX.get(i) > mapY.get(i)){
                mapX.put(i,mapY.get(i));
            }
        }

        for(int i = 9; i >= 0 ; i--){
            if ( i ==0){
                if(answer.length() != 0){
                    answer += String.valueOf(i).repeat(mapX.get(i));
                }else if(mapX.get(i) == 0){
                    return "-1";
                }else{
                    return "0";
                }
            }else{
                answer += String.valueOf(i).repeat(mapX.get(i));
            }
        }


        return answer;
    }
}
