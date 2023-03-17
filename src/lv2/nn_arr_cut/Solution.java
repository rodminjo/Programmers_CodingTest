package lv2.nn_arr_cut;


class Solution {
    public int[] solution(int n, long left, long right) {
        int answerLength = (int) (right - left + 1);
        int[] answer = new int[answerLength];
// 1. 리스트 이용 : 메모리를 너무 많이 씀
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i >= j){
//                    list.add(i+1);
//                }else {
//                    list.add(j+1);
//                }
//            }
//        }
//        System.out.println("list = " + list);
//        for (int i =(int)left ; i <= right ; i++) {
//            answer[i-(int)left] = list.get(i);
//        }

// 2. 변환식 이용
        int count = 0;

        for (long i = left ; i <= right ; i++) {
            long div = i / n;
            long remain = i % n;

            if (remain <= div) {
                answer[count++] = (int) div+1;
            }else {
                answer[count++] = (int) remain+1;
            }
        }


        return answer;
    }
}
