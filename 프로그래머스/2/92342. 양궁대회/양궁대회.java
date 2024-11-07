class Solution {
    int N;
    int[] infoArr;
    int max = 0;
    int[] arr = new int[]{-1};
    
    public int[] solution(int n, int[] info) {
        N = n;
        infoArr = info;
        
        dfs(n, 0, new int[11]);
        return arr;
    }
    
    public int cal(int[] ryon){
        int score = 0;
        for(int i = 0; i < 11; i++){
            if(ryon[i] == 0 && infoArr[i] == 0){
                continue;
            }
            
            if(ryon[i] > infoArr[i]){
                score += 10 - i;
            } else {
                score -= 10 - i;
            }
        }
        
        return score;
    }
    
    public void dfs(int remain, int index, int[] ryon){
        if(remain <= 0){
            int score = cal(ryon);
            
            if(arr.length > 1 && max == score){
                for(int i = 10; i > -1; i--){
                    if(arr[i] == ryon[i]){
                        continue;
                    } else {
                        if(arr[i] < ryon[i]){
                            arr = ryon;
                            max = score;
                        }
                        break;
                    }
                }
                
            } else if(max < score) {
                arr = ryon;
                max = score;
            }
            return;
        }
        
        for(int i = index; i < 11; i++){
            int need = Math.min(remain, infoArr[i] + 1);
            int[] cloneArr = ryon.clone();
            
            cloneArr[i] = need;
            dfs(remain - need, i + 1, cloneArr);
        }
    }
}