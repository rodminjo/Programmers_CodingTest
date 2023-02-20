package lv2.max_min;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        String max = arr[0];
        String min = arr[0];

        for(String str : arr) {
            max = Integer.valueOf(max) < Integer.valueOf(str) ? str : max;
            min = Integer.valueOf(min) > Integer.valueOf(str) ? str : min;
        }

        return (min +" "+ max) ;
    }
}