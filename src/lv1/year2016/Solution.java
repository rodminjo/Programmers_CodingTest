package lv1.year2016;

import java.time.*;
import java.util.List;

class Solution {
    public String solution(int a, int b) {
//        int days = daySum(a) + b;
//        switch(days%7){
//            case 1 : return "FRI";
//            case 2 : return "SAT";
//            case 3 : return "SUN";
//            case 4 : return "MON";
//            case 5 : return "TUE";
//            case 6 : return "WEN";
//        }
        LocalDate date = LocalDate.of(2016, a, b);
        String day = date.getDayOfWeek().toString().substring(0,3);
        return day;
    }

//    int daySum(int a){
//        List<Integer> thirtyoneArr = List.of(1,3,5,7,8,10,12);
//        List<Integer> thirtyArr = List.of(4,6,9,11);
//        List<Integer> twentynineArr =List.of(2);
//        int sum =0;
//        for(int i : thirtyoneArr){
//            if(i < a){
//                sum += 31;
//            } else{
//                break;
//            }
//        }
//        for(int i : thirtyArr){
//            if(i < a){
//                sum += 30;
//            } else{
//                break;
//            }
//        }
//
//        if ( 2 < a){
//            sum += 29;
//        }
//
//        return sum;
//    };
}
