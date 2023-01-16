package lv1.collatz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int solution(int num) {
        int count = 0;
        long number = num;
        if (number == 1) {
            return 0;
        }

        do {
            if (number % 2 == 0){
                number = (number / 2);
            }else{
                number = (number * 3) + 1;
            }
            count++;
        } while (count <= 500 && number != 1);

        if (count > 500) {
            return -1;
        } else {
            return count;
        }
    }
}
