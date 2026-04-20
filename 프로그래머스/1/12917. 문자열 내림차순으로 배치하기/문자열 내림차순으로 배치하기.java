import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        StringBuilder sb = new StringBuilder(new String(chArr));
        answer = sb.reverse().toString();
        return answer;
    }
}