package lv1.year2016;

public class SolutionRunner {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(1,6));
        System.out.println(sol.solution2(1,6));
        for (int i =1 ; i<= 12 ; i++){
            for (int j =1 ; j<= 29 ; j++){
                if(sol.solution(i,j).equals(sol.solution2(i,j))){
                }else{
                    System.out.println(i+"M"+j+"d");
                }
            }
        }

    }
}
