package lv1.making_prime_number;


class Solution {
    int sum = 0;
    int count = 0;
    public int solution(int[] nums) {
        for(int i =0 ; i < nums.length-2 ; i++) {
            for(int j = i+1 ; j < nums.length-1 ; j++) {
                for(int k = j+1 ; k < nums.length ; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if(sum % 2 !=0){
                        int co=0;
                        for (int c = 3; c<=Math.sqrt(sum); c++) {
                            if (sum % c == 0) {
                                co++;
                            }
                        }
                        if (co == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
