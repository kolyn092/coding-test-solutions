class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArr = s.toCharArray();
        int wordCount = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == ' ') {
                answer += ' ';
                wordCount = 0;
            }
            else {
                if (wordCount % 2 == 0) {
                    answer += Character.toUpperCase(chArr[i]); 
                } else {
                    answer += Character.toLowerCase(chArr[i]); 
                }
                wordCount++;
            }
        }
        return answer;
    }
}