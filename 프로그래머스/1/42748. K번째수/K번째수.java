import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {         
            List<Integer> list = new ArrayList<>();
            
            int[] nowArray = commands[i];
            int startIdx = nowArray[0] - 1;
            int endIdx = nowArray[1] - 1;
            // i번째부터 j번째까지 자르기
            for (int j = startIdx; j <= endIdx; j++) {
                list.add(array[j]);
            }
            // 정렬
            list.sort(Comparator.naturalOrder());
            // k번째 수 저장
            answerList.add(list.get(nowArray[2] - 1));
        }
        // array로 변경
        answer = answerList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}