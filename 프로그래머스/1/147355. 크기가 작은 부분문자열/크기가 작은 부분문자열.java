import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for (int i = 0; i < t.length(); i++) {
            
            // 인덱스 벗어나는 것을 방지하기 위한 끝점 계산
            int end = Math.min(t.length(), i + p.length());
            
            // 길이가 짧은 경우 break
            if (end - i < p.length()) {
                break;
            }
            
            // 시작점, 끝점 설정해서 문자열 가져오고 비교해서 같거나 작으면 ++
            String str = t.substring(i, end);
            if (str.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}