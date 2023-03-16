package lv2.tuple;

import java.util.*;

class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length() - 2);
        s = s.replace('{', '}');
        String s2 = s.replaceAll("},}", "k");
        String[] strArr = s2.split("k");
        Arrays.sort(strArr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        Set<String> set = new LinkedHashSet<>();
        for (String str : strArr){
            String[] strArr2 = str.split(",");
            for (String str2 : strArr2){
                set.add(str2);
            }
        }

        int[] answer = new int[set.size()];
        int count = 0;
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            answer[count] = Integer.valueOf(iterator.next());
            count++;
        }


        return answer;
    }
}
