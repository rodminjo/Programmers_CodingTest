package lv2.jump_n_teleportation;


public class Solution {
    public int solution(int n) {
        int countK = 0;


        while(n > 0){
            if (n % 2 == 1){
                n -= 1;
                countK++;
            }else{
                n /= 2;
            }
        }

        return countK;
    }
}
