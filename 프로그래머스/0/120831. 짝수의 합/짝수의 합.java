class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = n / 2;
        answer = cnt * (cnt + 1);   
        return answer;
    }
}