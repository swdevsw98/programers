package Lv1;

public class 부족한_금액_계산하기 {
        public long 부족한_금액_계산하기(int price, int money, int count) {
            long answer = -1;
            long sum = 0;
            for(int i = 1; i <= count; i++){
                if (i == 1){
                    sum = price;
                    continue;
                }
                sum += price * i;
            }
            answer = money - sum;
            if(answer < 0)
                return answer * -1;
            else
                return 0;
        }
}
