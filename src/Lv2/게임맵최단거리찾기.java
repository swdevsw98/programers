package Lv2;
import java.util.*;

public class 게임맵최단거리찾기 {

    class Solution {
        int[] dx = {0 , 1 , 0 , -1};
        int[] dy = {1, 0, -1, 0};

        public int solution(int[][] maps) {
            int answer = 0;
            int[][] check = new int[maps.length][maps[0].length];


            BFS(maps, check);

            answer = check[maps.length-1][maps[0].length-1];
            if(answer == 0 )
                return -1;

            return answer;
        }

        public void BFS(int[][] maps, int[][] check){
            int x = 0;
            int y = 0;
            check[x][y] = 1;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[] {0, 0});

            while(!queue.isEmpty()) {
                int[] now = queue.poll();
                for(int i = 0; i < 4; i++) {
                    int nx = now[0] + dx[i];
                    int ny = now[1] + dy[i];

                    if(nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length)
                        continue;

                    if(check[nx][ny] == 0 && maps[nx][ny] == 1) {
                        check[nx][ny] = check[now[0]][now[1]] + 1;
                        queue.offer(new int[] { nx, ny});
                    }
                }
            }
        }
    }
}
