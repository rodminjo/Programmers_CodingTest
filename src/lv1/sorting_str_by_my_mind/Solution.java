package lv1.sorting_str_by_my_mind;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] strings, int n) {
        int num = n;

        List<String> list = Arrays.asList(strings);
        List<String> arrList = new ArrayList<>(list);
        List<String> list2 =arrList.stream().sorted().sorted((s1,s2) -> ((int)s1.charAt(n)) - ((int)s2.charAt(n))).collect(Collectors.toList());
        String[] answer = list2.toArray(new String[list2.size()]);
        return answer;

    }

}

