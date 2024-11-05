class Solution {
    public int[][] dungeonArr;
    public boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        dungeonArr = dungeons;
        visited = new boolean[dungeons.length];
        
        int answer = find(k, 0);
        return answer;
    }
    
    public int find(int health, int count){
        if(health <= 0){
            return count;
        }
        
        int max = count;
        for(int i = 0; i < dungeonArr.length; i++){
            if(visited[i]){
                continue;
            }

            if(health < dungeonArr[i][0]){
                continue;
            }
            
            visited[i] = true;
            max = Math.max(max, find(health - dungeonArr[i][1], count + 1));
            visited[i] = false;
        }

        return max;
    }
}