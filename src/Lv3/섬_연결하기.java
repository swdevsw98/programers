package Lv3;
import java.util.*;

public class 섬_연결하기 {
    class Solution {
        public int[] parent;
        public int get_parent(int a) {
            if(a == parent[a])
                return parent[a];
            else
                return parent[a] = get_parent(parent[a]);
        }
        public void union(int a, int b) {
            a = get_parent(a);
            b = get_parent(b);
            if(a > b)
                parent[a] = b;
            else
                parent[b] = a;
        }
        public int solution(int n, int[][] costs) {
            int answer = 0, i, j;
            parent = new int[n];
            for(i = 0; i < parent.length; parent[i] = i++);
            Arrays.sort(costs, (o1,o2) -> o1[2] - o2[2]);
            for(i = 0; i < costs.length; i++) {
                if(get_parent(costs[i][0]) == get_parent(costs[i][1]))
                    continue;
                union(costs[i][0], costs[i][1]);
                answer += costs[i][2];
            }
            return answer;



            // for(int i = 0; i < costs.length; i++){
            //     if(edge == n-1)
            //         break;
            //     if(visited[i] < 2) {
            //         edge++;
            //         answer += costs[i][2];
            //         visited[costs[i][0]]++;
            //         visited[costs[i][1]]++;
            //     }
            // }
        }


    }
}
