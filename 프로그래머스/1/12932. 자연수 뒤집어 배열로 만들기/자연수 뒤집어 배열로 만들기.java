import java.util.*;
import java.util.stream.Stream;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n));
        String str = sb.reverse().toString();
        int[] answer = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        return answer;
    }
}