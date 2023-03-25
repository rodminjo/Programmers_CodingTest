package lv0.age_of_planet;

class Solution {
    public String solution(int age) {
        char[] chars = String.valueOf(age).toCharArray();
        StringBuilder sb = new StringBuilder();
        //1~9 48~57
        //a~j = 97~106
        for (char c : chars) {
            char k =(char) (c + 49);
            sb.append(k);
        }


        return sb.toString();
    }
}
