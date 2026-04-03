class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        try {
            answer = (int)((double)num1 / (double)num2 * 1000);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        return answer;
    }
}