package lv1.caesar_cipher;

// char -> int , int -> char 잘 살펴보기
class Solution {
    public String solution(String s, int n) {
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char e : charArr) {
            if(e==32){
                sb.append(e);
            }else if(e>=97 && e<=122){
                sb.append(e+n >122 ? (char) (e+n-26) : (char) (e+n));
            }else{
                sb.append(e+n >90 ? (char) (e+n-26) : (char) (e+n));
            }
        }


        return sb.toString();
    }
}
