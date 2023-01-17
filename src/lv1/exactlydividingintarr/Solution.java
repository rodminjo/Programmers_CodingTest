package lv1.exactlydividingintarr;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {

       int[] sortedArr = Arrays.stream(arr).sorted().filter(e -> e % divisor ==0).toArray();

        if (sortedArr.length == 0) {
            return new int [] {-1};
        }
        return sortedArr;


    }
}
