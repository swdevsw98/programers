package Lv2;
import java.util.*;

public class 구명보트 {

    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;

            Arrays.sort(people);
            //효율성 탈락
            // for(int i = 0; i < people.length; i++) {
            //     if(people[i] == -1)
            //         continue;
            //     int max = limit - people[i];
            //     int min = 0;
            //     int minIndex = 0;
            //     for(int j = i; j < people.length; j++){
            //         if(people[j] >= min && people[j] <= max && i != j){
            //             min = people[j];
            //             minIndex = j;
            //         }
            //         if(j == people.length - 1){
            //             if(min == 0) {
            //                 people[i] = -1;
            //                 answer++;
            //             } else{
            //                 people[i] = -1;
            //                 people[minIndex] = -1;
            //                 answer++;
            //             }
            //         }
            //     }
            // }
            int min = 0;

            for (int max = people.length - 1; min <= max; max--){
                if (people[min] + people[max] <= limit) min++;
                answer++;
            }

            return answer;
        }
    }
}
