package lv2.arr_multiply;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length;
        int mid = arr1[0].length;
        int col = arr2[0].length;
        int[][] answer = new int[row][col];
        int sum = 0;

        for (int i = 0 ; i < row ; i++) {
           for (int j = 0 ; j < col ; j++) {
               sum = 0;
               for (int k = 0 ; k < mid ; k++) {
                   sum += arr1[i][k] * arr2[k][j];
               }
               answer[i][j] = sum;
            }
        }

        return answer;
    }
}
