package lv1.middlechatget;

class Solution {
    public String solution(String s) {
        String[] str =s.split("");
        int leng = s.length();
        if (leng % 2 == 0){
            return str[(leng / 2)-1] + str[(leng / 2)];
        } else{
            return str[(leng / 2)];

        }
    }
}
