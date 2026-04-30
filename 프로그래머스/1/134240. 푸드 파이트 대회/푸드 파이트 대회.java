class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < food.length; i++) {
            String nowStr = Integer.toString(i);
            nowStr = nowStr.repeat(food[i] / 2);
            answer += nowStr;
        }
        
        sb.append(answer);        
        String reverseStr = sb.reverse().toString();   
        answer += food[0] - 1;       
        answer += reverseStr;
        
        return answer;
    }
}