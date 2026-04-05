import java.util.Arrays;

// 그리디 알고리즘
public class Meeting {
    private static int maxMeetings(int[][] meetings) {
        // 1.종료 시간을 기준으로 오름차순 정렬
        Arrays.sort(meetings, (a, b) -> a[1] - b[1]);
        // 2.가장 일찍 끝나는 회의 카운트 1 증가
        int count = 1;
        // 3.해당 회의의 종료 시간 저장
        int lastEndTime = meetings[0][1];
        // 4.해당 회의의 종료 시간보다 시작 시간이 같거나 늦은 회의 중에서
        //   가장 일찍 끝나는 회의 선택하고 카운트 증가
        for (var meet : meetings) {
            if (meet[0] >= lastEndTime) {
                count++;
                lastEndTime = meet[1];
            }
        }
        // 5.회의 카운트 반환
        return count;
    }
    public static void main(String[] args) {
        // 테스트용 회의 배열 생성
        int[][] meetings = {
                {1, 4},  // 1번팀
                {3, 5},  // 2번팀
                {0, 6},  // 3번팀
                {5, 7},  // 4번팀
                {3, 8},  // 5번팀
                {5, 9},  // 6번팀
                {6, 10}, // 7번팀
                {8, 11}  // 8번팀
        };

        // 최대 회의 개수 구하기
        int maxCount = maxMeetings(meetings);
        System.out.println("최대 진행 가능한 회의 수: " + maxCount);
    }
}