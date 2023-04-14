package Lv1;

public class 숫자_문자열과_영단어 {class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] compare = {"zero", "one" , "two" , "three" , "four",
                "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < compare.length; i++)
            s = s.replace(compare[i], Integer.toString(i));

        answer = Integer.parseInt(s);
        return answer;
    }
}
}
