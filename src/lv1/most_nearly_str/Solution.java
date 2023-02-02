package lv1.most_nearly_str;

class Solution {
    public int[] solution(String s) {
        int leng = s.length();
        String[] strArr = s.split("");
        int[] result = new int[leng];

        for(int i = 0; i < leng; i++) {
            result[i] = -1;
            if (i !=0) {
                for(int j = i-1 ; j >= 0 ; j--) {
                    if(strArr[i].equals(strArr[j])) {
                        result[i] = i - j;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
