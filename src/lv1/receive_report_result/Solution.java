package lv1.receive_report_result;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        TreeMap<String, Integer> idMap = new TreeMap<>();
        int[] result = new int[id_list.length];
        ArrayList<String> ar = new ArrayList<>();
        HashSet<String> setReport = new HashSet<>();

        // id list 를 id 당 처리결과메일 갯수에 저장
        for(String id : id_list) {
            idMap.put(id,0);
            ar.add(id);
        }
        //report 중복 제거
        for(String s : report) {
            setReport.add(s);
        }
        report = setReport.toArray(new String[setReport.size()]);

        //중복처리 후 reporter , ban 배열선언
        String[] reporter = new String[report.length];
        String[] ban = new String[report.length];

        // ban과 reporter 입력
        for(int i = 0; i < report.length; i++) {
            int index = report[i].indexOf(" ");
            reporter[i]= report[i].substring(0,index);
            ban[i] = report[i].substring(index +1);
        }

        // 신고횟수 저장
        for (String b : ban){
           idMap.put(b,idMap.get(b)+1);
        }

        // 처리결과 메일 횟수 저장
        for(int i=0 ; i < id_list.length; i++) {
            if(idMap.get(id_list[i])>=k){
                for(int j = 0; j < ban.length; j++) {
                    if (id_list[i].equals(ban[j])){
                        result[ar.indexOf(reporter[j])]++;
                    }
                }
            }
        }

        return result;
    }
}
