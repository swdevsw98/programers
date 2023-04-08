package Lv1;

public class 로또의_최고순위와_최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int zeroCount = 0;
            int matchCount = 0;
            int max = 0;
            int min = 0;
            for(int i : lottos) {
                if(i == 0){
                    zeroCount++;
                    continue;
                } else {
                    for(int j : win_nums) {
                        if(i == j) {
                            matchCount++;
                            break;
                        }
                    }
                }

            }

            max = matchCount + zeroCount;
            min = matchCount;

            if (matchCount == 0 && zeroCount == 0)
                answer[0] = 6;
            else
                answer[0] = 7-max;

            if(min == 0 || min == 1)
                answer[1] = 6;
            else
                answer[1] = 7 - min;

            return answer;
        }

    }
}
