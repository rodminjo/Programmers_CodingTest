package lv1.arraysum;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];;
        for(int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
    // 조건이 배열의 크기는 같음. 즉 answer 배열의 크기를 arr1과 같이 해도 상관없음.

}
