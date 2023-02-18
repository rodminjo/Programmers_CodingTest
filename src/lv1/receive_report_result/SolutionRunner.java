package lv1.receive_report_result;

import java.util.Arrays;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"con", "ryan"},new String[]{"ryan con", "ryan con", "ryan con", "ryan con"}, 3)));
    }
}
