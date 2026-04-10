class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            // 공백이면 그대로 추가하고 continue
            if (ch == ' ') {
                answer += ch;
                continue;
            }
            // 아스키 코드로 변경
            var num = (int)ch;
            num += n;
            // 대소문자에 따라 연산
            if (Character.isUpperCase(ch)) {
                if (num > (int)'Z') {
                    num = num - 'Z' + 'A' - 1;
                }
            } else {
                if (num > (int)'z') {
                    num = num - 'z' + 'a' - 1;
                }
            }
            // 문자로 변환해서 추가
            answer += (char)num;
        }
        return answer;
    }
}