class Solution {
    public String solution(int a, int b) {
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDay = 0;
        
        for (int i = 0; i < a - 1; i++) {
            totalDay += month[i];
        }
        
        totalDay += b;
        
        return day[(totalDay + 4) % 7];
    }
}