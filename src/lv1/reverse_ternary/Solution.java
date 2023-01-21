package lv1.reverse_ternary;

class Solution {
    public int solution(int n) {
        int location = 0;
        int remainder = n;
        int sum = 0;

        while(n >= method(location)){
            location++;
        }

        int[] arr = new int[location];

        for (int i = (location-1); i >=0; i--){
            arr[i] = remainder / method(i);
            remainder = remainder % method(i);
        }

        for(int i =0; i< arr.length ; i++){
           sum += arr[arr.length-1-i] * method(i);
        }

        return sum;

        //생각해보기
        //String a = "";
//        while(n > 0){
//            a = a + (n % 3);
//            n /= 3;
//        }

    }

    public int method(int m){
        int i = m==0 ? 1 : 3 * method(m-1);
        return i;
    }
}
