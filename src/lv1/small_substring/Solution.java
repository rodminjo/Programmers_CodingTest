package lv1.small_substring;

class Solution {
    public int solution(String t, String p) {
        int leng = p.length();
        int count = 0;
        Long intp = Long.valueOf(p);

        for(int i = 0; i <= t.length()-leng; i++) {
            if(Long.valueOf(t.substring(i, i+leng)) <= intp){
                count++;
            }
        }

        return count;
    }
}
