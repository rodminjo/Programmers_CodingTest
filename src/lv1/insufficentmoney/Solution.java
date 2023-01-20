package lv1.insufficentmoney;

class Solution {
    public long solution(int price, int money, int count) {
        long total = (count * (count + 1) / 2 * ((long) price)) - money;
        return total > 0 ? total : 0;
    }
}
