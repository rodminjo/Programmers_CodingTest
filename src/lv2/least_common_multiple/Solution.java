package lv2.least_common_multiple;

// 유클리드 호제법으로 최대공약수 구하고 두 수의 곱 / 최대공약수 = 최소공배수 이용

class Solution {
    public int solution(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            max = Math.max(max, i);
        }

        int leastCommon= max;
        boolean check = true;


        while(check){
            int count = 0;
            for (int i : arr) {
                if(max % i !=0){
                    count++;
                }
            }
            if (count == 0){
                check = false;
            }else{
                max ++;
            }
        }
        return max;
    }
}