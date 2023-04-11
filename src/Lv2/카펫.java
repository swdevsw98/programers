package Lv2;

public class 카펫 {
    class Solution {
        public int[] solution(int brown, int yellow) {
            int[] answer = new int[2];
            int area = brown + yellow;

            for(int i = 1; i <= area; i++){
                int row = i;
                int col = area / i;

                if(row < col)
                    continue;
                if((row-2) * (col-2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                }
            }
            return answer;
        }
    }
}
