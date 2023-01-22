package lv1.making_strange_str;

class Solution {
    public String solution(String s) {
        String[] arrStr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        int count = -1;

        for(String str : arrStr) {
            if(str.equals(" ")){
                count = -1;
                sb.append(str);
            }else{
                count++;
                if(count %2 ==0){
                    sb.append(str.toUpperCase());
                }else{
                    sb.append(str);
                }
            }
        }



        return sb.toString();
    }
}