package lv1.year2016;

import java.time.*;
import java.util.List;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        String day = date.getDayOfWeek().toString().substring(0, 3);
        return day;

    }

    public String solution2 ( int a, int b) {
            List<Integer> thirtyoneArr = List.of(1, 3, 5, 7, 8, 10, 12);
            List<Integer> thirtyArr = List.of(4,6,9,11);
            List<Integer> twentynineArr =List.of(2);
            String day = "THU";
            int sum =0;
            for(int i : thirtyoneArr){
                if(i < a){
                    sum += 31;
                } else{
                    break;
                }
            }
            for(int i : thirtyArr){
                if(i < a){
                    sum += 30;
                } else{
                    break;
                }
            }

            if (2 < a){
                sum += 29;
            }

            sum += b;

            switch(sum%7){
                case 1 : day =  "FRI";
                break;
                case 2 : day =  "SAT";
                break;
                case 3 : day = "SUN";
                break;
                case 4 : day = "MON";
                break;
                case 5 : day = "TUE";
                break;
                case 6 : day = "WED";
            }

            return day;
    };

}
