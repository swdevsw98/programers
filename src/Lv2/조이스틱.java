package Lv2;
import java.util.*;

public class 조이스틱 {
    class Solution {
        public int solution(String name) {
            int answer = 0;
            int move = name.length() - 1; // 오른쪽으로 쭉 간 횟수

            for(int i = 0; i < name.length(); i++) {
                answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A')); //상,하 알파벳 맞추기
                if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                    int endA = i + 1;
                    while(endA < name.length() && name.charAt(endA) == 'A')
                        endA++;
                    move = Math.min(move, i * 2 + (name.length() - endA));// 오른쪽으로 갔다 다시 왼쪽으로 꺾기
                    move = Math.min(move, i + (name.length() - endA) * 2);// 왼쪽으로 갔다 다시 오른쪽으로 꺾기
                }
            }
            return answer + move;
        }
    }
}
