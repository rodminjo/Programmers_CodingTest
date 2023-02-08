package lv1.weapon_of_knight;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] arr = new int[number +1];
        arr[1] = 1;

        for(int i = 2 ; i < number+1; i++){
            int count =0;
            for(int j = 2; j <= i / 2; j++){
                count += i % j ==0 ? 1 :0;
            }
            answer += (count+2) > limit ? power : (count+2);
        }

        return answer + 1;
    }
}

// 약수를 구하는 방법 2 : 이중 for문으로 두 수를 곱하고 곱한 수의 배열에 카운트 ++, 이 방법이 시간이 훨씬 빠름
//for (int i = 1; i <= number; i++) {
//            for (int j = 1; j <= number / i; j++) {
//                count[i * j]++;
//            }
//        }