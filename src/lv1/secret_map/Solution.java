package lv1.secret_map;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String zero = "0";
        String[][] arr1Str = new String[n][n];
        String[][] arr2Str = new String[n][n];
        String[] result = new String[n];
        String cal;


        for (int i = 0 ; i < n ; i++){
            cal = Integer.toBinaryString(arr1[i]);
            if (cal.length() < n){
                cal = zero.repeat(n - cal.length()) + cal;
            }
            for (int j= 0 ; j < n ; j++) {
                arr1Str[i][j] = cal.substring(j,j+1);
            }
        }

        for (int i = 0 ; i < n ; i++){
            cal = Integer.toBinaryString(arr2[i]);
            if (cal.length() < n){
                cal = zero.repeat(n - cal.length()) + cal;
            }
            for (int j= 0 ; j < n ; j++) {
                arr2Str[i][j] = cal.substring(j,j+1);
            }
        }

        for (int i = 0 ; i < n ; i++) {
            result[i] = "";
            for (int j = 0 ; j < n ; j++) {
                result[i] += arr1Str[i][j].equals("0") & arr2Str[i][j].equals("0") ? " " : "#" ;
            }
        }

        return result;
    }
}
