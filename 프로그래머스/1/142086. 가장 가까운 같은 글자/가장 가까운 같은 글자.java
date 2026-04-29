import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char nowCh = s.charAt(i);

            if (map.containsKey(nowCh)) {
                answer[i] = i - map.get(nowCh);
            } else {
                answer[i] = -1;
            }
            map.put(nowCh, i);
        }

        return answer;
    }
}