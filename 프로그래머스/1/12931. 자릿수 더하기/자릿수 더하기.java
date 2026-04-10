import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;      
        String answerStr = Integer.toString(n);       
        for (int i = 0; i < answerStr.length(); i++) {
            answer += Character.getNumericValue(answerStr.charAt(i));
        }
        return answer;
    }
}