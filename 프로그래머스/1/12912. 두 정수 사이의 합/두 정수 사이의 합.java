class Solution {
    public long solution(int a, int b) {
        long small = 0; // 작은값
        long big = 0;   // 큰값
        
        if (a > b) {
            small = b;
            big = a;
        } else if (a < b) {
            small = a;
            big = b;
        } else {
            return a;
        }
        
        if ((big - small) % 2 == 0) {
            return ((small + big) * ((big - small) / 2)) + ((small + big) / 2);
        } else {
            return (small + big) * (((big - small) / 2) + 1);
        }
    }
}