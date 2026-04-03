package level1.FindQuotient;

public class FindQuotient {
    public int solution(int num1, int num2) {
        int answer = 0;
        try {
            answer = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        return answer;
    }

    public static void main(String[] args) {
        FindQuotient findQuotient = new FindQuotient();
        System.out.println(findQuotient.solution(1,0));
    }
}
