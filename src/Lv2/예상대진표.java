package Lv2;

public class 예상대진표 {
    class Solution
    {
        public int solution(int n, int a, int b)
        {
            int answer = 1;

            for(int i = 0; i < n/2; i++) {
                if(Math.abs(a-b) == 1 && Math.abs((a/2) - (b/2)) == 1)
                    break;
                if(a % 2 == 1)
                    a++;
                if(b % 2 == 1)
                    b++;
                a = a/2;
                b = b/2;
                answer++;
            }

            return answer;
        }
    }
}
