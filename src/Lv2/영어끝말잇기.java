package Lv2;

public class 영어끝말잇기 {
    class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];
            int person = 1;
            int count = 1;
            boolean TnF = false;

            //첫번쨰문자가 사이즈 1
            if(words[0].length() == 1);
            else{

                for(int i = 1; i < words.length; i++) {
                    person++;
                    if(words[i-1].length() == 1 || words[i].length() == 1)
                        break;

                    if (i % n == 0) {
                        person /= n;
                        count++;
                    }

                    //앞뒤 글자가 같은지
                    if(!(words[i-1].substring(words[i-1].length()-1)).equals(words[i].substring(0,1))){
                        break;
                    }

                    //같은 단어 찾기
                    for(int j = 0; j < i; j++) {
                        if(words[j].equals(words[i])) {
                            TnF = true;
                            break;
                        }
                    }


                    if(TnF == true)
                        break;



                    //모두 맞추면 0,0
                    if(i == words.length - 1) {
                        person = 0;
                        count = 0;
                    }
                }
            }

            answer[0] = person;
            answer[1] = count;
            return answer;
        }
    }
}
