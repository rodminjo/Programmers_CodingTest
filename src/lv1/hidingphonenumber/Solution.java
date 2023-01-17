package lv1.hidingphonenumber;

public class Solution {
    public String solution(String phone_number) {
        String star = "*";
        String backNum = phone_number.substring(phone_number.length()-4,phone_number.length());

        String answer =star.repeat(phone_number.length()-4)+backNum;


        return answer;
    }
}
