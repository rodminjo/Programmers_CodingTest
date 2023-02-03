package lv1.dartgame;


import java.util.Arrays;

class Solution {
    public int solution(String dartResult) {

        StringBuilder sb = new StringBuilder();
        int[] scores = new int[3];
        int[] multi = new int[3];
        String[] options = new String[3];
        int sum = 0;

        // 배열 나누기
        for(int i =0 ; i < dartResult.length() ; i++){
            switch(dartResult.charAt(i)){
                case 'T' : sb.append("-T@"); break;
                case 'D' : sb.append("-D@"); break;
                case 'S' : sb.append("-S@"); break;
                case '*' : sb.append("-*-"); break;
                case '#' : sb.append("-#-"); break;
                default: sb.append(dartResult.charAt(i));
            }
        }
        for(int i =0 ; i < 3 ; i++){
            if(sb.indexOf("@-") != -1) {
                sb.replace(sb.indexOf("@-"), sb.indexOf("@-") + 2, "-");
            }
        }
        for(int i =0 ; i < 3 ; i++){
            if(sb.indexOf("@") != -1) {
                sb.replace(sb.indexOf("@"), sb.indexOf("@") + 1, "- -");
            }
        }
        String[] strArr = sb.toString().split("-");
        System.out.println(Arrays.toString(strArr));

        for(int i =0 ; i < strArr.length ; i+=3){
            scores[i / 3] = Integer.parseInt(strArr[i]);
        }
        for(int i =1 ; i < strArr.length ; i+=3){
            if (strArr[i].equals("T")){
                multi[i/3] = 3;
            } else if (strArr[i].equals("D")){
                multi[i/3] = 2;
            } else {
                multi[i/3] = 1;
            }
        }
        for(int i =2 ; i < strArr.length ; i+=3){
            options[i/3] = strArr[i];
        }
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(multi));
        System.out.println(Arrays.toString(options));
        // 점수배열 획득
        for (int i =0 ; i < 3 ; i++) {
            scores[i] = (int) Math.pow(scores[i], multi[i]);
        }

        // option 확인
        for(int i = 0 ; i < 3; i++){
            if(options[i].equals("#")){
                scores[i] = -scores[i];
            }else if(options[i].equals("*")){
                if (i != 0) {
                    scores[i] *= 2;
                    scores[i - 1] *= 2;
                } else {
                    scores[i] *= 2;
                }
            }
        }

        // 총계
        for(int i : scores){
            sum += i;
        }
        return sum;
    }
}
