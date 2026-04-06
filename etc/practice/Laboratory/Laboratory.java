import java.util.Scanner;

public class Laboratory {

    // 인덱스 벗어나는지 체크
    public static boolean isValidIndex(int[][] arr, int i, int j) {
        return 0 <= i && i < arr.length && 0 <= j && j < arr[i].length;
    }

    public static int Solution(int[][] grid, int p, int q) {
        int result = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                int sum = grid[i][j];   // 중심값

                // 상하좌우 접근 가능한 인덱스인지 확인 후 합산
                if (isValidIndex(grid, i + 1, j)) {
                    sum += grid[i + 1][j];
                }
                if (isValidIndex(grid, i - 1, j)) {
                    sum += grid[i - 1][j];
                }
                if (isValidIndex(grid, i, j + 1)) {
                    sum += grid[i][j + 1];
                }
                if (isValidIndex(grid, i, j - 1)) {
                    sum += grid[i][j - 1];
                }

                // 기존 최대값과 비교해서 큰 값 저장
                result = Math.max(sum, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        // 테스트케이스 수 입력
        var testcaseCount = scanner.nextInt();
        for (int count = 0; count < testcaseCount; count++) {
            // 각 테스트케이스 실험대 크기 입력
            var p = scanner.nextInt();
            var q = scanner.nextInt();
            int[][] amountArr = new int[p][q];
            // 각 비커에 담긴 물의 양 입력
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    amountArr[i][j] = scanner.nextInt();
                }
            }
            // 연산 및 String 조합
            sb.append(count + 1).append("# ").append(Solution(amountArr, p, q)).append("\n");
        }
        System.out.println(sb);
    }
}
