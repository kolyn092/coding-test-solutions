import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};
        for (int i = 0; i < wallpaper.length; i++) {
            int minX = wallpaper[i].indexOf('#');
            if (minX != -1) {
                answer[0] = Math.min(answer[0], i);
                answer[1] = Math.min(answer[1], minX);
            }
            int maxX = wallpaper[i].lastIndexOf('#');
            if (maxX != -1) {
                answer[2] = Math.max(answer[2], i);
                answer[3] = Math.max(answer[3], maxX);
            }
        }
        answer[2] += 1;
        answer[3] += 1;
        return answer;
    }
}