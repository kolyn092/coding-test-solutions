class Solution {
    public String solution(String phone_number) {
        String answer = "*";
        int length = phone_number.length();
        int startpoint = length - 4;
        answer = answer.repeat(startpoint);
        answer += phone_number.substring(startpoint);
        return answer;
    }
}