package lv1.betweentwointsum;


import java.util.stream.LongStream;

public class Solution {
    public long solution(int a, int b) {
        long x = a;
        long y = b;
        if (x == y) {
            return x;
        }
        if(x>y){
            x = b;
            y= a;
        }


        long sum = LongStream.rangeClosed(x, y).reduce(0, (e1, e2) -> e1 + e2);
        return sum;

    }
}
