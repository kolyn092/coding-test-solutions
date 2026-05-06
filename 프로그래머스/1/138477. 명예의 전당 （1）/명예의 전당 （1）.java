import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            pQ.add(score[i]);
            if (pQ.size() > k) {
                pQ.remove();
            }
            answerList.add(pQ.peek());
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}