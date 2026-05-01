class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int quotient = (n / a) * b;
            int remain = n % a;
            answer += quotient;
            n = quotient + remain;
        }
        return answer;
    }
}