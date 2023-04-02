package Lv3;

public class 네트워크 {class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]) {
                DFS(i, computers, visited);
                answer++;
            }
        }

        return answer;
    }

    public boolean[] DFS(int n, int[][] computers, boolean[] visited) {
        visited[n] = true;

        for(int j = 0; j < computers.length; j++) {
            if(computers[n][j] == 1 && visited[j] == false && n != j){
                visited = DFS(j, computers, visited);
            }
        }
        return visited;
    }
}
}
