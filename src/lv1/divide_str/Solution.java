package lv1.divide_str;

class Solution {
    public int solution(String s) {
        char[] strArr = s.toCharArray();
        char startStr = strArr[0];
        int startStrCount=0;
        int findStrCount=0;
        int answer = 0;


        for (int i =0; i < strArr.length; i++) {
            if (strArr[i]==(startStr)){
                startStrCount++;
            } else{
                findStrCount++;
            }

            if (startStrCount == findStrCount){
                startStr =(i != strArr.length-1) ? strArr[i+1] : ' ';
                startStrCount = 0;
                findStrCount = 0;
                answer ++;
            }

        }

        if(startStrCount !=0){
            answer ++;
        }

        return answer;


    }
    // split 을 이용하는것보단 toCharArray 이용하는 것이 속도가 빠름
//    public int solution(String s) {
//        String[] strArr = s.split("");
//        String startStr = strArr[0];
//        int startStrCount=0;
//        int findStrCount=0;
//        int answer = 0;
//
//
//        for (int i =0; i < strArr.length; i++) {
//            if (strArr[i].equals(startStr)){
//                startStrCount++;
//            } else{
//                findStrCount++;
//            }
//
//            if (startStrCount == findStrCount){
//                startStr =(i != strArr.length-1) ? strArr[i+1] : "";
//                startStrCount = 0;
//                findStrCount = 0;
//                answer ++;
//            }
//
//        }
//
//        if(startStrCount !=0){
//            answer ++;
//        }
//
//        return answer;
//    }
}