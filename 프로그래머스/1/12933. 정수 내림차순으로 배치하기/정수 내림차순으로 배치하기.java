import java.util.stream.Stream;
import java.util.*;

class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        int[] intArr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intArr);
        String sortStr = "";
        for (int i = intArr.length - 1; i >= 0; i--) {
            sortStr += Integer.toString(intArr[i]);
        }
        return Long.parseLong(sortStr);
    }
}