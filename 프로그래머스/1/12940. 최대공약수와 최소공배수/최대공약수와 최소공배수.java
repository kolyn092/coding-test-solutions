class Solution {
    public int[] solution(int n, int m) {
        int gcdResult = gcd(n, m);     
        int lcmResult = n * m / gcdResult;              
        int[] answer = {gcdResult, lcmResult};
        return answer;
    }
    
    public static int gcd(int n, int m) {
        if (n == 0 || m == 0) {
            return n + m;
        }
        
        if (n > m) {
            return gcd(n % m, m);
        } else {
            return gcd(n, m % n);
        }
    }
}