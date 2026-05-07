import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int count = 0;
        for (int i = score.length - 1; i >= 0; i--) {
            if (count < m) {
                if (count + 1 == m) {
                    answer += (score[i] * m);
                    count = 0;
                }
                else {
                    count++;   
                }
            }
        }
        return answer;
    }
}