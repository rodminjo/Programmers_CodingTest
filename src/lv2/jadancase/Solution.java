package lv2.jadancase;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        sb.append(Character.toUpperCase(arr[0]));

        for (int i =1; i< arr.length; i++){
            if (arr[i-1] == ' '){
                arr[i] = Character.toUpperCase(arr[i]);
            }
            sb.append(arr[i]);
        }


        return sb.toString();
    }
}
