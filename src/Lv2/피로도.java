package Lv2;
import java.util.*;

public class 피로도 {

    class Solution {
        public int solution(int k, int[][] dungeons) {
            int answer = 0;

            for(int i = 0; i < dungeons.length; i++){
                int max = 0;
                int maxIndex = 0;

                //최소 피로도의 최대값 찾기 + k보다 작은
                for(int j = 0; j < dungeons.length; j++){
                    if(max < dungeons[j][0] && k >= dungeons[j][0]) {
                        max = dungeons[j][0];
                        maxIndex = j;
                    }
                }


                if(max != 0 && dungeons[maxIndex][0] != -1){
                    k -= dungeons[maxIndex][1];
                    dungeons[maxIndex][0] = -1;
                    answer++;
                }
            }


            return answer;
        }
    }
}
