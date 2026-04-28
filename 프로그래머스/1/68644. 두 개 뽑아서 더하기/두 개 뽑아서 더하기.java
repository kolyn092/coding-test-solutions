import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        int num = 1;
        while (num < numbers.length) {
            for (int i = 0; i < numbers.length; i++) {
                if (i != num) {
                    int result = numbers[i] + numbers[num];
                    if (!list.contains(result)) {
                        list.add(result);
                    }  
                }
            }
            num++;
        }
        list.sort(Comparator.naturalOrder());
        answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();

        return answer;
    }
}