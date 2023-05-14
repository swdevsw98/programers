package Lv1;
import java.util.*;

public class 예산 {

    class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;

            Arrays.sort(d);

            for(int i = 0; i < d.length; i++){
                if(budget < d[i])
                    break;
                budget -= d[i];
                answer++;
            }


            return answer;
        }
    }
}
