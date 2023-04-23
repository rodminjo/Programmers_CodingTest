package lv2.fatigue;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(80,new int[][]{{80,20},{50,40},{30,10}}));
    }
}
