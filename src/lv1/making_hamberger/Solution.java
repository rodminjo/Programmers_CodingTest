package lv1.making_hamberger;



class Solution {
    public int solution(int[] ingredient) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

            for (int i =0 ; i < ingredient.length; i++){
                sb.append(ingredient[i]);
                if (sb.length()>3 && sb.substring(sb.length()-4).equals("1231")) {
                    sb=sb.delete(sb.length()-4,sb.length());
                    count++;
                }
            }


       return count;
    }
}
