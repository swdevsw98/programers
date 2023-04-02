package Lv2;
import java.util.*;

public class 타겟넘버 {

    class Solution {
        int answer = 0;
        public int solution(int[] numbers, int target) {
            DFS(numbers, 0, target, 0);

            return answer;
        }
        public void DFS(int[] arr, int depth, int target, int sum) {
            if(depth == arr.length) {
                if(sum == target) answer++;
            } else {
                DFS(arr, depth + 1, target, sum + arr[depth]);
                DFS(arr, depth + 1, target, sum - arr[depth]);
            }
        }
    }
}
