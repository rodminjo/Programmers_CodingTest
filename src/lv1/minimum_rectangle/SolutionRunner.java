package lv1.minimum_rectangle;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};

        System.out.println(sol.solution(sizes));
    }
}
