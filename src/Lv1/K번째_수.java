package Lv1;
import java.util.*;
public class K번째_수 {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];
            for(int i = 0; i < commands.length; i++) {
                int k = commands[i][2];
                int N = commands[i][1] - commands[i][0];
                int[] temp = new int[N+2];
                int h = 0;
                for(int j = commands[i][0]-1; j < commands[i][1]; j++){
                    temp[h++] = array[j];
                }
                Arrays.sort(temp);
                answer[i]=temp[k];
            }
            return answer;
        }

}
