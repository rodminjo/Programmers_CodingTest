package lv2.word_relay;

import java.util.Arrays;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3,new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
}
