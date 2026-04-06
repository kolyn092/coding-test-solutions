import java.util.*;
import java.util.stream.IntStream;

public class MusicTest {

    public static int[] Solution(String[] answers) {
        int[] correctScores = {0,0,0};

        String[] pattern1 = {"도", "레", "미", "파"};                // 1번 응시자의 패턴 4개마다 반복 (도,레,미,파)
        String[] pattern2 = {"레", "레", "파", "파", "도", "도"};     // 2번 응시자의 패턴 6개마다 반복 (레,레,파,파,도,도)
        String[] pattern3 = {"미", "파", "미", "도", "레", "도"};     // 3번 응시자의 패턴 6개마다 반복 (미,파,미,도,레,도)

        // 점수 계산
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(pattern1[i % pattern1.length])) {
                correctScores[0] += 1;
            }
            if (answers[i].equals(pattern2[i % pattern2.length])) {
                correctScores[1] += 1;
            }
            if (answers[i].equals(pattern3[i % pattern3.length])) {
                correctScores[2] += 1;
            }
        }

        // 가장 높은 점수 확인
        var maxCount = Arrays.stream(correctScores).max().getAsInt();

        // 높은 점수와 일치하는 인덱스들 배열로 반환
        return IntStream.range(0, correctScores.length).filter(i-> correctScores[i] == maxCount).toArray();
    }

    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        String[] answers = new String[count];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = scanner.next();
        }

        StringBuilder sb = new StringBuilder();
        var result = Solution(answers);
        for (var res : result) {
            sb.append(res + 1).append(" ");
        }
        System.out.println(sb);
    }
}
