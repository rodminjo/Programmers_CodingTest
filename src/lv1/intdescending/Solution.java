package lv1.intdescending;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public long solution(long n) {
        List<String> list = new ArrayList<>(Arrays.asList(String.valueOf(n).split("")));
        List<Integer> list2 = new ArrayList<>(List.of());
        for (String s : list){
        list2.add(Integer.valueOf(s));
        }
        list2.sort(Integer::compareTo);
        String number= "";
        for (int i = 0; i < list2.size(); i++) {
            number = String.valueOf(list2.get(i))+number;
        }

        return Long.valueOf(number);


        //StringBuilder 사용해보기

    }

}
