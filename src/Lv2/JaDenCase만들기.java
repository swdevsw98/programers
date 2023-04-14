package Lv2;

public class JaDenCase만들기 {
    class Solution {
        public String solution(String s) {
            String answer = "";
            s = s.toLowerCase();
            String[] arr = s.split("");
            boolean start = true;

            for(int i = 0; i < arr.length; i++){
                if(start) {
                    arr[i] = arr[i].toUpperCase();
                    start = false;
                }
                if(arr[i].equals(" "))
                    start = true;

                answer += arr[i];
            }

            return answer;
        }
    }
}
