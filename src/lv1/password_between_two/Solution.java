package lv1.password_between_two;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String s, String skip, int index) {
        char[] sArr = s.toCharArray();
        char[] skipArr = skip.toCharArray();
        ArrayList<Character> alphabet = new ArrayList<>();

        for(int i = 0 ; i <= 25 ; i++){
            alphabet.add((char)(i + 97));
        }
        for (char c : skipArr) {
            alphabet.remove(Character.valueOf(c));
        }
        System.out.println(Arrays.toString(alphabet.toArray()));
        int size = alphabet.size();
        for(int c=0; c < sArr.length ; c++) {
            int indexNum = alphabet.indexOf(Character.valueOf(sArr[c]))+index;
            indexNum = indexNum % size;
            sArr[c] = alphabet.get(indexNum);
        }

        String answer = new String(sArr);

        return answer;
    }
}
