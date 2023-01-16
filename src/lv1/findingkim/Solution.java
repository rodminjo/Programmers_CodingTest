package lv1.findingkim;

public class Solution {
    public String solution(String[] seoul) {
        int index=0;
        for(String s : seoul) {
            if(s.equals("Kim")) {
                break;
            }else{
                index++;
            }
        }
        String answer = String.format("김서방은 %d에 있다",index);
        return answer;


    }
}
