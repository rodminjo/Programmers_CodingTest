package lv2.cache;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        List<String> cache = new LinkedList<>();

        if (cacheSize ==0){
            return (cities.length * 5);
        }

        for (String city : cities) {
            city = city.toLowerCase();

            if (cache.size() < cacheSize) {
                if (cache.contains(city)){
                    cache.remove(city);
                    cache.add(city);
                    answer ++;
                }else{
                    cache.add(city);
                    answer+= 5;
                }

            }else{
                if (cache.contains(city)) {
                    cache.remove(city);
                    cache.add(city);
                    answer++;
                }else{
                    cache.add(city);
                    cache.remove(0);
                    answer += 5;
                }
            }
        }


        return answer;
    }
}
