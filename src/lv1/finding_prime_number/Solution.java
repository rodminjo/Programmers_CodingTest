package lv1.finding_prime_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int n) {
        // 방법 1
        boolean[] arr = new boolean[n + 1];
        int count = 0;
        for(int i = 2 ; i <=n; i++){
            if(!arr[i]){
                count++;
                for(int j = 2; j <= n / i; j++){
                    arr[i*j] = true;
                }
            }
        }

        return count;
        // -------------------------------------
        // 방법 2
        /*
        int check=0;
        int count = 1;
        for (int i = 3; i <= n; i += 2) {
            System.out.println(i);
            for(int j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check++;
                }
            }
            if (check == 0){
                count++;
            }
            // check 초기화
            check = 0;
        }

        return count; */

        //--------------------------------------
        // 방법 3
        /*
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>(List.of(1,2,3,5,7));
        for(int i = 2; i <= n ; i++) {
            if (i % 2 ==0) {
            }else if(i % 3 ==0){
            }else if(i % 5 ==0){
            }else if(i % 7 ==0){
            } else {
                list.add(i);
            }
        }
        while(list.isEmpty()== false) {
            int a = list.get(0);
            list.remove(0);
            result.add(a);
            for(int i =3 ; i <= n / a ; i++) {
                list.remove(Integer.valueOf(a * i));
            }
        };

        return result.size();

         */
    }
}
