package lv2.find_number_in_base_k;


class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String kNumber = Integer.toString(n, k);
        String[] splitStr = kNumber.split("0");

        for (int i =0; i < splitStr.length; i++) {
            if (splitStr[i]==null || splitStr[i].equals("")){
                continue;
            }

            Double strToInt = Double.valueOf(splitStr[i]);
            boolean checked = false;
            if (strToInt !=1){
                for (int j =2 ; j <= Math.sqrt(strToInt); j++){
                    if (strToInt%j == 0){
                        checked = true;
                        break;
                    }
                }
            }else {
                checked = true;
            }

            if (!checked){
                answer++;
            }
        }

        return answer;
    }
}
