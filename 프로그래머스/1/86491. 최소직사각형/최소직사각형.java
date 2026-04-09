class Solution {
    // 60 70 60 80 = 80
    // 50 30 30 40 = 50
    
    // 10 12 15 14 15 = 15
    // 7 3 8 7 5 = 8
    public int solution(int[][] sizes) {
        int wmax = 0;
        int hmax = 0;
        for(int i = 0; i < sizes.length; i++) {
            int big = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);
            
            wmax = Math.max(wmax, big);
            hmax = Math.max(hmax, small);
        }
        return wmax * hmax;
    }
}