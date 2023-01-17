package lv1.mostsmallvalueremove;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length==1){
            return new int[] {-1};
        }

        int[] result = new int[arr.length-1];
        int min = arr[0];
        for(int i : arr){
            min = i<min ? i : min;
        }
        int count = 0;
        for(int i : arr){
            if(i!=min) {
                result[count] = i;
                count++;
            }
        }

        return result;
    }
}
