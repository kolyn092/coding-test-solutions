import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int x = (int)Math.sqrt(n);
        if (n - Math.pow(x, 2) == 0) {
            return (long)Math.pow(x+1, 2);
        } else {
            return -1;
        }
    }
}