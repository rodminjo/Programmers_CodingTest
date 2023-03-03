package lv2.lifeboat;

import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int boatNum = 0;
        int remainWeight = 0;
        Arrays.sort(people);
        int indexMin = 0;
        int indexMax = people.length - 1;

        while(indexMin < indexMax) {
            if(people[indexMin] + people[indexMax] <= limit) {
                boatNum++;
                indexMin++;
                indexMax--;
            }else{
                boatNum++;
                indexMax--;
            }
        }

        boatNum = indexMin==indexMax ? boatNum + 1 : boatNum;


        return boatNum;
    }
}