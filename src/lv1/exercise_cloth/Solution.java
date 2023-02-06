package lv1.exercise_cloth;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 1. 여벌옷이 있는 학생 배열을 구함
        // 2. 앞번호부터 있는지 확인, 뒷번호 확인 후 배열에서 poll
        // 3. 빌렸다면 count ++
        int count = 0;
        int[] student = new int[n+1];
        // 여벌옷 판단
        for(int i : reserve){
            student[i] ++;
        }
        // 여벌옷이 있는 인원중 도난당한 학생
        for(int i : lost){
            student[i] --;
        }

        // 마지막 배열이 없을 경우 예외처리. 행렬을 n+1로 선언하면 더 간단함.
        for (int i = 1 ; i < student.length ; i++){
            if(student[i]==-1){
                try {
                    if (student[i - 1] == 1) {
                        student[i] = 0;
                        student[i - 1] = 0;
                    } else if (student[i + 1] == 1) {
                        student[i] = 0;
                        student[i + 1] = 0;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {}
            }
        }

        for (int i : student){
            count += i != -1 ? 1 : 0;
        }

        return count-1;
    }
}