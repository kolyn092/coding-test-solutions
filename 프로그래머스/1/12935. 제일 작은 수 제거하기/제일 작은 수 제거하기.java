import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] result = Arrays.stream(arr).filter(i -> i != min).toArray();
        if (result.length == 0) {
            return new int[]{-1};
        }
        return result;
    }
}