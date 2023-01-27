package lv1.number_str_and_alphabet;

//replaceAll 사용해보기
class Solution {
    public int solution(String s) {
        char[] strArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int c=0;c<strArr.length; c++) {
            if(strArr[c] <=57 && strArr[c] >=48) {
            sb.append(strArr[c]);
            }else if(strArr[c] <= 122 && strArr[c] >= 97) {
                if (strArr[c] == 'z'){
                    sb.append("0");
                    c += 3;
                } else if (strArr[c] == 'o') {
                    sb.append("1");
                    c += 2;
                } else if (strArr[c] == 't') {
                    if (strArr[c+1] == 'w') {
                        sb.append("2");
                        c += 2;
                    } else {
                        sb.append("3");
                        c += 4;
                    }
                } else if (strArr[c] == 'f'){
                    if (strArr[c+1] == 'o') {
                        sb.append("4");
                        c += 3;
                    } else {
                        sb.append("5");
                        c += 3;
                    }
                } else if (strArr[c] == 's') {
                    if (strArr[c+1] == 'i') {
                        sb.append("6");
                        c += 2;
                    } else {
                        sb.append("7");
                        c += 4;
                    }
                } else if (strArr[c] == 'e') {
                    sb.append("8");
                    c += 4;
                } else if (strArr[c] == 'n') {
                    sb.append("9");
                    c += 3;
                }

            }
        }

        s.replaceAll("6","SIX");

        int answer = Integer.valueOf(sb.toString());
        return answer;
    }
}
