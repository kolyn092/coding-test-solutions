class Solution {
    public String solution(int n) {
        String word = "수박";
        String answer = word.repeat(n/2);
        if (n % 2 != 0) {
            answer += "수";
        }
        return answer;
    }
}