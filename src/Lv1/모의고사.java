package Lv1;
import java.util.*;

public class 모의고사 {

    class Solution {
        public int[] solution(int[] answers) {
            int[] answer;
            int[] d1 = {1,2,3,4,5}; //5개
            int[] d2 = {2,1,2,3,2,4,2,5}; //8개
            int[] d3 = {3,3,1,1,2,2,4,4,5,5}; //10개
            int[] c = {0,0,0};

            for(int i = 0; i < answers.length; i++){
                if(d1[i % 5] == answers[i])
                    c[0]++;
                if(d2[i % 8] == answers[i])
                    c[1]++;
                if(d3[i % 10] == answers[i])
                    c[2]++;
            }

            int max = Math.max(c[0], Math.max(c[1], c[2]));

            // 최대 점수를 가진 수포자 리스트 생성
            List<Integer> answ = new ArrayList<Integer>();
            for(int i=0; i<c.length; i++) if(max == c[i]) answ.add(i+1);

            answer = new int[answ.size()];
            for(int i=0; i<answ.size(); i++){
                answer[i] = answ.get(i);
            }


            return answer;
        }
    }
}
