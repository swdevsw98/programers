package Lv2;

public class 짝지어제거하기 {
    class Solution
    {
        public int solution(String s)
        {
            int answer = -1;

            for(int i = 0; i < s.length() - 1; i++) {
                String t1 = s.substring(i, i+1);
                String t2 = s.substring(i+1, i+2);
                if(t1.equals(t2)){
                    String temp = t1 + t2;
                    s = s.replaceFirst(temp, "");
                    i = -1;
                }
            }

            if(s.equals(""))
                return 1;

            return 0;
        }
    }
}
