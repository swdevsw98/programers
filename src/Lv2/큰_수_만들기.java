package Lv2;

public class 큰_수_만들기 {class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder(); //스트링을 합치는데 용이
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}
}
