package level2.PredictedBracket;

class PredictedBracket
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        for (int i = 0; i < n; i++) {
            if (a % 2 == 0) {
                if (a - 1 == b) {
                    return round;
                } else {
                    a = Math.max(a, a-1)/2;
                    if (b % 2 == 0) {
                        b = Math.max(b, b-1)/2;
                    } else {
                        b = Math.max(b, b+1)/2;
                    }
                    round++;
                }
            } else {
                if (a + 1 == b) {
                    return round;
                } else {
                    a = Math.max(a, a+1)/2;
                    if (b % 2 == 0) {
                        b = Math.max(b, b-1)/2;
                    } else {
                        b = Math.max(b, b+1)/2;
                    }
                    round++;
                }
            }
        }
        return round;
    }
}