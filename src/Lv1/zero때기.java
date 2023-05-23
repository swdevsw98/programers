package Lv1;

public class zero때기 {
    class Solution {
        public String solution(String n_str) {
            String answer = "";
            int count = 0;

            for(int i = 0; i < n_str.length() -1; i++){
                String temp = n_str.substring(i, i+1);
                if(!temp.equals("0"))
                    break;
                else
                    count++;
            }

            answer = n_str.substring(count, n_str.length());
            return answer;
        }
    }
}
