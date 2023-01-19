package lv1.stringsorted;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr= s.toCharArray();
        Arrays.sort(charArr);
        StringBuilder lowerStr = new StringBuilder();
        StringBuilder upperStr = new StringBuilder();

        for(int i=0;i<charArr.length;i++){
            if(charArr[i]>=65&&charArr[i]<=90){
                upperStr.insert(0,charArr[i]);
            } else if(charArr[i]>=97&&charArr[i]<=122){
                lowerStr.insert(0,charArr[i]);
            }
        }

        return lowerStr.append(upperStr).toString();



    }
    // reverse 메소드 이용
//    public String reverseStr(String str){
//        char[] sol = str.toCharArray();
//        Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();
//    }


}
