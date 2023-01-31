package lv1.food_fighter;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int foodNo= 1;

        //물을 제외한 나머지  /2 하기
        for(int i = 1; i < food.length ; i++){
            food[i] = food[i] / 2;

            for (int j = 1; j <= food[i] ; j++) {
                sb.append(foodNo);
            }
            foodNo++;
        }

        sb.append("0");
        foodNo -= 1;

        for(int i = food.length-1 ; i >= 1 ; i--){
            for (int j = 1; j <= food[i] ; j++) {
                sb.append(foodNo);
            }
            foodNo--;
        }

        return sb.toString();

        /* 방법 2
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int foodNo= 1;

        //물을 제외한 나머지  /2 하기
        for(int i = 1; i < food.length ; i++){
            food[i] = food[i] / 2;

            for (int j = 1; j <= food[i] ; j++) {
                sb.append(foodNo);
            }
            foodNo++;
        }
        String[] middle = sb.toString().split("");
        sb.append("0");

        for (int i = middle.length - 1; i >= 0; i--) {
            sb.append(middle[i]);
        }

        return sb.toString();
    }
*/
    }
}
