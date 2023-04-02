package Lv1;
import java.util.*;

public class 최소직사각형 {
    class Solution {
        public int solution(int[][] sizes) {
            int answer = 0;
            int max_v=0;
            int max_h=0;
            for(int i=0;i<sizes.length;i++){
                if(sizes[i][0] < sizes[i][1]) {
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(max_v < sizes[i][0]) max_v = sizes[i][0];
                if(max_h < sizes[i][1]) max_h = sizes[i][1];
            }
            return answer=max_v*max_h;
        }
    }

}
