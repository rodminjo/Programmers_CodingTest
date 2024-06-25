package lv2.game_map_shortest_length;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        return explore(maps);
    }

    private int explore(int[][] maps){
        boolean[][] booleans = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>();
        int totalX = maps[0].length - 1;
        int totalY = maps.length - 1;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        // x, y, dist
        int[] init = {0, 0, 1};
        queue.offer(init);

        while (!queue.isEmpty()){
            int[] val = queue.poll();

            if (val[0] == totalX && val[1] == totalY){
                return val[2];
            }

            for (int i = 0; i < 4; i++){
                int newDx = Math.max(0, val[0] + dx[i]);
                int newDy = Math.max(0, val[1] + dy[i]);
                int newDist = val[2] + 1;

                if (newDx <= totalX && newDy <= totalY && maps[newDy][newDx] != 0 && !booleans[newDy][newDx]){
                    queue.offer(new int[]{newDx, newDy, newDist});
                    booleans[newDy][newDx] = true;
                }

            }
        }

        return -1;
    }


}
