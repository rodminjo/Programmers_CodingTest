package lv0.onangee;

class Solution {
    public int solution(String[] babbling) {

        int answer = 0;
        for(String str: babbling){
            String check = str;
            check = check.replace("aya"," ");
            check = check.replace("ye"," ");
            check = check.replace("woo"," ");
            check = check.replace("ma"," ");
            check = check.trim();
            if(check.length() == 0){
                answer +=1;
            }
        }


        return answer;
    }
}
